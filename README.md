# Task7_RESTAPI

[src/main](https://github.com/capyybara/Task7_RESTAPI/tree/master/src/main/java/com/Task7RESTAPI/PetsList)
に記載されています

<br>

---

## GETリクエスト
- curlコマンドでの実行結果

```
curl --location --request GET 'http://localhost:8080/petnames/1' -i
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 07 Aug 2023 05:26:37 GMT

{"id":1,"petsName":"Tama","age":1}fujitasakinoMacBook-Air:~ fujitasaki$ 
![image](https://github.com/capyybara/Task7_RESTAPI/assets/137416338/208f84e7-5702-4c0b-9ef2-bab5a46bfca7)

```

<br>

- Postmanでの実行結果
<img width="636" alt="第7回課題 GETリクエスト" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/a71af865-e7ff-4d85-9784-ed8603d4441b">

<br>
<br>

---

## POST リクエスト
- curlコマンドでの実行結果

```
 fujitasaki$ curl 'http://localhost:8080/petnames' -H 'Content-Type: application/json' -d '{"id":3, "petsname":"Pocho", "age":3 }' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> POST /petnames HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.88.1
> Accept: */*
> Content-Type: application/json
> Content-Length: 38
> 
< HTTP/1.1 201 
< Location: http://localhost:8080/petnames/id
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 29
< Date: Fri, 11 Aug 2023 06:18:51 GMT
< 
* Connection #0 to host localhost left intact
Petsname successfully createdfujitasakinoMacBook-Air:Task7_PetsList fujitasaki$ 
```

<br>

- Postmanでの結果
<br><br>
  <img width="654" alt="スクリーンショット 2023-08-11 15 09 23" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/a2b88b53-4d12-4e71-a35f-e40b76f8005a">

<br><br>

---

## PATCHリクエスト

- curlコマンド

```
curl -X PATCH 'http://localhost:8080/petnames/1' \
-H 'Content-Type: application/json' \
-d '{"id":1, "petsName":"Hanako", "age":2}' -v
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> PATCH /petnames/1 HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.88.1
> Accept: */*
> Content-Type: application/json
> Content-Length: 38
> 
< HTTP/1.1 200 
< Content-Type: application/json
< Transfer-Encoding: chunked
< Date: Tue, 15 Aug 2023 09:37:03 GMT
< 
* Connection #0 to host localhost left intact
{"message":"petsname successfully updated"}fujitasakinoMacBook-Air:Task7_PetsList fujitasaki$ 

```

<br>

- Postmanでの結果

<img width="1440" alt="PATCH Postman" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/507cfd7f-1614-48a0-8639-0bf461dbcc85">



