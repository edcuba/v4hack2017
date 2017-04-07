import http.server
import socketserver

PORT = 54269

class Handler(http.server.SimpleHTTPRequestHandler):

    #Handler for the POST requests
    def do_POST(self):
        print(self.headers)
        amount = self.headers['content-length']
        data = self.rfile.read(int(amount))
        f = open("tmp.jpg", 'wb')
        f.write(data)
        f.close()
        self.send_response(200)
        self.send_header('Content-type','text/http')
        self.send_header('Object-id', '0')
        self.send_header('Object-type', 'lamp')
        self.end_headers()
        return

try:
    server = socketserver.TCPServer(('', PORT), Handler)
    print('Started server on port ' + str(PORT))
    server.serve_forever()
except KeyboardInterrupt:
	print('Shutting down')
	server.socket.close()
