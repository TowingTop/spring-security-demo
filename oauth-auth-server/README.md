# oauth-auth-server
OAuth2 Authorization Server Demo

## Request for user token
Go to request for an access token, by curl command
```console
curl http://localhost:8080/oauth/token
    -d "grant_type=password&username=ytong82&password=password" 
    -H "Content-type:application/x-www-form-urlencoded; charset=utf-8" 
    -u myclient:secret
```

Get response like below
```json
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTI2NjQ4ODcsInVzZXJfbmFtZSI6Inl0b25nODIiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwianRpIjoiZGNiZDY4MDYtNTYzOC00Mjc1LThhMjktZjM2YTM2YTQ0OGQzIiwiY2xpZW50X2lkIjoibXljbGllbnQiLCJzY29wZSI6WyJyZWFkIl19.G3fFlUVn_TRSykZlKCjZpdWLBnZclrNn6IxhZlUAb3E",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJ5dG9uZzgyIiwic2NvcGUiOlsicmVhZCJdLCJhdGkiOiJkY2JkNjgwNi01NjM4LTQyNzUtOGEyOS1mMzZhMzZhNDQ4ZDMiLCJleHAiOjE1NTUxNzA0ODcsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiI5MDY4ZWY4NC03NWIyLTQ2ZWMtYjg4Ny0yMDhkNmI3ZDJlMjkiLCJjbGllbnRfaWQiOiJteWNsaWVudCJ9.iR5M2FXwWFiCedc7vRCVLVOAQHmW-Iyc82XsE9f4jes",
    "expires_in": 86399,
    "scope": "read",
    "jti": "dcbd6806-5638-4275-8a29-f36a36a448d3"
}
```

## Request for app token
Go to request for an access token, by curl command
```console
curl http://localhost:8080/oauth/token
    -d "grant_type=client_credentials"
    -H "Content-type:application/x-www-form-urlencoded; charset=utf-8" 
    -u myclient:secret
```
Get response like below
```json
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJyZWFkIl0sImV4cCI6MTU1Mjc1MjUyOCwianRpIjoiMzRlNTA0MTQtMzI4Mi00NzJiLTk1MmYtMTk3YWU2OGE4MWY3IiwiY2xpZW50X2lkIjoibXljbGllbnQifQ.GY75YxHrLj4GUckyrSuItAjzzbnex56veElLA-vDhyo",
    "token_type": "bearer",
    "expires_in": 86399,
    "scope": "read",
    "jti": "34e50414-3282-472b-952f-197ae68a81f7"
}
```
