package io.github.edynox.riot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class AskServer{
    private String default_url = "http://10.10.4.212:55555";

    public int post(String request) throws Exception {

        String response = "";
        URL url = new URL(default_url);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(15000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.setDoOutput(true);


        OutputStream os = conn.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
        writer.write(request);
        writer.flush();
        writer.close();
        os.close();
        int objId = 0;

        int responseCode = conn.getResponseCode();

        if (responseCode == HttpsURLConnection.HTTP_OK) {
            String line;
            BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line=br.readLine()) != null) {
                if (line.contains("object:")) {
                    Scanner in = new Scanner(line);
                    objId = in.nextInt();
                    break;
                }
            }
        } else {
            throw new IOException("BAD RESPONSE");
        }
        return objId;
    }
}
