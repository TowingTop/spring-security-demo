# spring-security-demo
Spring Security Demo

Go to request for an access token
```bash
curl http://localhost:8080/oauth/token
    -d"grant_type=password&username=ytong82&password=password" 
    -H"Content-type:application/x-www-form-urlencoded; charset=utf-8" 
    -u myclient:secret
```
