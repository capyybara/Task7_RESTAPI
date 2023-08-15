package com.Task7RESTAPI.PetsList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Map;

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


    //   POSTはブラウザでは確認できない????→HTMLの編集が必要になる？
    @PostMapping("/petnames")
    public ResponseEntity<String>create(@RequestBody NameCreateForm form){
        URI url=UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/petnames/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("Petsname successfully created");
    }


    @PatchMapping("/petnames/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody NameUpdateForm form){
        return ResponseEntity.ok(Map.of("message", "petsname successfully updated"));
    }

    @DeleteMapping("/petnames/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id){
        return ResponseEntity.ok(Map.of("message", "successfully deleted"));
    }

}
