package com.Task7RESTAPI.PetsList;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;

public class NameCreateForm {

    @Validated
    @NotBlank
    public String petsname;

    public int id;
    public int age;

    public NameCreateForm(String petsname, int id, int age) {
        this.petsname = petsname;
        this.id = id;
        this.age = age;
    }

    public String getPetsname() {
        return petsname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }


}
