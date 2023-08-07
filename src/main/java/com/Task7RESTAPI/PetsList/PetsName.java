package com.Task7RESTAPI.PetsList;

public class PetsName {

    private int id;
    private String petsName;
    private  int age;

    public PetsName(int id, String petsName, int age) {
        this.id = id;
        this.petsName = petsName;
        this.age = age;
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
}
