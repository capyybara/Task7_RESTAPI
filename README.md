# Task7_RESTAPI

[src/main](https://github.com/capyybara/Task7_RESTAPI/tree/master/src/main/java/com/Task7RESTAPI/PetsList)
に記載されています


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

## POST リクエスト
- curlコマンド（一度やってみたもの）<br>
[元の記述](https://github.com/capyybara/Task7_RESTAPI/blob/6a4503989816ad69f7c44962c6de8f76136f50bd/src/main/java/com/Task7RESTAPI/PetsList/PetsNameController.java#L31C4-L41C1)

- （仮）実行結果 <br>

```
$ curl 'http://localhost:8080/petnames' \
> -H 'Content-Type: application/json' \
> -d '{
>     "petname": "Ponta"
> }' -i
HTTP/1.1 201 
Location: http://localhost:8080/petnames/id
Content-Type: text/plain;charset=UTF-8
Content-Length: 25
Date: Mon, 07 Aug 2023 06:05:32 GMT
 
name successfully createdfujitasakinoMacBook-Air:~ fujitasaki$ 

```

<br><br>
- 現状のメモです💦
<img width="1440" alt="スクリーンショット 2023-08-07 17 48 29" src="https://github.com/capyybara/Task7_RESTAPI/assets/137416338/3f2243f4-ba7c-423b-9b75-d1f47dd86ff7">

  
