package com.mycompany.app.finaltest;

public final class DTOClass {



    public DTOClass(String s, String s1) {

        this.fullName =s+ s1;
    }
    public DTOClass(Integer s, Integer s1) {
        this.fullName =""+s+ s1;
    }


    public String getFullName() {
        return fullName;
    }
    public Integer getInt() {
        return fullName.indexOf(".");
    }


    private  String fullName;
    private int age;


    public DTOClass createDTOClass(String s){
        return this;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "DTOClass{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}