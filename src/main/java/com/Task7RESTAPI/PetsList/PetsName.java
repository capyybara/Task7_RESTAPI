package com.Task7RESTAPI.PetsList;

public class PetsName {

    private int id;
    private String petsName;
    private  int age;

    private String birthplace;

    public PetsName(int id, String petsName, int age, String birthplace) {
        this.id = id;
        this.petsName = petsName;
        this.age = age;
        this.birthplace = birthplace;
    }

    public int getId() {
        return id;
    }
    public String getPetsName() {
        return petsName;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }
}
