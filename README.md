# Task7_RESTAPI

[src/main](https://github.com/capyybara/Task7_RESTAPI/tree/master/src/main/java/com/Task7RESTAPI/PetsList)
に記載されています

<br><br>

---

## GETリクエスト
- curlコマンドでの実行結果

```
fujitasakinoMacBook-Air:Task7_PetsList fujitasaki$ curl --location --request GET 'http://localhost:8080/petnames/1' -i
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Fri, 18 Aug 2023 08:25:59 GMT

{"id":1,"petsName":"Tama","age":2,"birthplace":"京都"}fujitasakinoMacBook-Air:Task7_PetsList fujitasak

```


<br>

- Postmanでの実行結果
- 
<img width="645" alt="GET Postman birthplace" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/3de1f7b8-e4f1-4cf7-8d41-8842411126c3">

<br>
<br>

---

## POST リクエスト
- curlコマンドでの実行結果

```
 fujitasaki$ curl 'http://localhost:8080/petnames' \
> -H 'Content-Type: application/json' \
> -d '{
>  "id":3,
>  "petsname":"Pocho",
>  "age":3,
>  "birthplace": "京都"
> }' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> POST /petnames HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.88.1
> Accept: */*
> Content-Type: application/json
> Content-Length: 67
> 
< HTTP/1.1 201 
< Location: http://localhost:8080/petnames/id
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 29
< Date: Fri, 18 Aug 2023 08:43:14 GMT
< 
* Connection #0 to host localhost left intact
Petsname successfully createdfujitasakinoMacBook-Air:~ fujitasaki$ 

```


<br>

- Postmanでの結果
<br><br>
 
  <img width="642" alt="POST Postman birth~" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/e2f699bb-8584-414a-b0be-f9ed7f6fdd41">



<br><br>

---

## PATCHリクエスト

- curlコマンド

```

fujitasaki$ curl -X PATCH 'http://localhost:8080/petnames/1' \
> -H 'Content-Type: application/json' \
> -d '{
>  "id":1,
>  "petsName": "Hanako",
>  "age":2,
>  "birthplace": "大阪"
> }' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> PATCH /petnames/1 HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.88.1
> Accept: */*
> Content-Type: application/json
> Content-Length: 69
> 
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Fri, 18 Aug 2023 08:47:31 GMT
< 
* Connection #0 to host localhost left intact
{"message":"Petsname successfully updated"}fujitasakinoMacBook-Air:~ fujitasaki$ 

```

<br>

- Postmanでの結果
- 
<img width="779" alt="PATCH Postman birth~ " src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/82d3d756-eef9-4986-b2bc-c1dc8aa2134f">


<br><br>

---

## DELETE

- curlコマンド

```
fujitasaki$ curl --location --request DELETE 'http://localhost:8080/petnames/4' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> DELETE /petnames/4 HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.88.1
> Accept: */*
> 
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Fri, 18 Aug 2023 08:58:54 GMT
< 
* Connection #0 to host localhost left intact
{"message":"successfully deleted"}fujitasakinoMacBook-Air:~ fujitasaki$ 
```

<br>

- Postmanでの結果

<img width="761" alt="DELETE Postman birthplace" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/3cacb3c2-91f3-425b-b3f0-b52b9075883f">

