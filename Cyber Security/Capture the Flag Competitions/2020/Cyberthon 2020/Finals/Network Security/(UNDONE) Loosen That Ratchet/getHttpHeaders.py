import re
import zlib

def HTTPHeaders(http_payload):
    try:
        # isolate headers
        headers_raw = http_payload[:http_payload.index("\r\n\r\n") + 2]
        regex = "(?:[\r\n]{0,1})(\w+\-\w+|\w+)(?:\ *:\ *)([^\r\n]*)(?:[\r\n]{0,1})"
        headers = dict(re.findall(regex, headers_raw, re.UNICODE))
        print(headers)
        return headers
    except:
        return None
    if 'Content-Type' not in headers:
        return None
    return headers
5
def extractText(headers, http_payload):
        text = None
        try:
            if 'text/plain' in headers['Content-Type']:
                text = http_payload[http_payload.index("\r\n\r\n")+4:]
                try:
                    if "Accept-Encoding" in headers.keys():
                        if headers['Accept-Encoding'] == "gzip":
                            text = zlib.decompress(text,  16+zlib.MAX_WBITS)
                    elif headers['Content-Encoding'] == "deflate":
                        text = zlib.decompress(text)
                except: pass
        except:
            return None
        return text
