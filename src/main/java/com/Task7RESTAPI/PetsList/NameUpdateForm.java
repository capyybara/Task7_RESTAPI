package com.Task7RESTAPI.PetsList;

public class NameUpdateForm {
    public String petsname;
    public int id;
    public int age;

    public NameUpdateForm(String petsname, int id, int age) {
        this.petsname = petsname;
        this.id = id;
        this.age = age;
    }

    public String getPetsname () {
        return petsname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
