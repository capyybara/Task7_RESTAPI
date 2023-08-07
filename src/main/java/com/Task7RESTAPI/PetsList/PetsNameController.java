package com.Task7RESTAPI.PetsList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


import java.net.URI;
import java.util.List;

//【課題】HTTPメソッドのGET/POST/PATCH/DELETE のリクエストを扱えるController を実装する　
// オリジナルの仕様を追加

@RestController
public class PetsNameController {

    //    講義をみて作ってみたもの
    @GetMapping("/petsname")
    public List<String> getnames(){
        return List.of("Tama", "Hachi", "Ponta","Nana");
    }


    //    id と紐付けたver. （「0001」にすると８進整数の⚠️が出る）
    @GetMapping("/petnames/{id}")
    public PetsName getNames(@PathVariable int id){
        return  (new PetsName(1, "Tama", 1));
    }


//    講義の資料のように、"name":"Pochi" のみの登録はできました
    @PostMapping("/petnames")
    public ResponseEntity<String>create(@RequestBody NameCreateForm form){
        URI url=UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/petnames/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("namesuccessfullycreated");
    }




//    このコードの場合、500エラーが出る
    @PostMapping("/petnames")
    public ResponseEntity<String> create(@PathVariable int id, @RequestBody NameCreateForm form){
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/petnames/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }




}