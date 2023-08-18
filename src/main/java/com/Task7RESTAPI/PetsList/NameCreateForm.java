package com.Task7RESTAPI.PetsList;

public class NameCreateForm {
    public String petsname;
    public int id;
    public int age;

    public String birthplace;

    public NameCreateForm(String petsname, int id, int age, String birthplace) {
        this.petsname = petsname;
        this.id = id;
        this.age = age;
        this.birthplace = birthplace;
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

    public String getBirthplace() {
        return birthplace;
    }
}
