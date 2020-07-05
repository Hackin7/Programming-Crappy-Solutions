>>> import base64
>>> s = "TWVycnltYXkgaGFzIHRhdWdodCBtZSBhbmRyb2lkIGRpc2Fzc2VtYmx5IGJlZm9yZS4gR29zaCwgd2h5IGhhdmVudCBJIGxvb2tlZCBhdCB0aGUgU291cmNlPyBRMjkxYkdRZ1l6QnVRelIwSUdKbElIUm9aU0IzWVhrZ2RHOGdaMjgv"
>>> base64.b64decode(s)
b'Merrymay has taught me android disassembly before. Gosh, why havent I looked at the Source? Q291bGQgYzBuQzR0IGJlIHRoZSB3YXkgdG8gZ28/'
>>> base64.b64decode(s)
b'Merrymay has taught me android disassembly before. Gosh, why havent I looked at the Source? Q291bGQgYzBuQzR0IGJlIHRoZSB3YXkgdG8gZ28/'