package com.Task7RESTAPI.PetsList;

public class NameCreateForm {
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
