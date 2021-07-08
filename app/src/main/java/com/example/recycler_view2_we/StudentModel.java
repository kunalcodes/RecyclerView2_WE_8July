package com.example.recycler_view2_we;

public class StudentModel {

    private String name;
    private String address;
    private String dob;
    private int age;
    private int imageId;

    public StudentModel(String name, String address, String dob, int age, int imageId) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.age = age;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getdob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public int getImageId() {
        return imageId;
    }
}
