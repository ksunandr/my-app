package com.mycompany.app;

public class DTOClass {

//    public DTOClass() {
//    }
//    public DTOClass(String fullName) {
//        this.fullName = fullName;
//    }


//    public DTOClass(String[] s) {
//        System.out.println(s[0]);
//        this.fullName = s[0]+s[1];
//    }
//
//    public DTOClass(Integer[][] s, String s1, Integer s2 ) {
//        System.out.println(s2);
//        this.fullName = s[0][1]+s[1][0]+s1;
//        this.age = s2;
//    }
//
//    public DTOClass(Integer[][] s, String s1 ) {
//        System.out.println(s1);
//        this.fullName = s[0][1]+s[1][0]+s1;
//    }
//
//    public DTOClass(Integer[][] s, Integer s1, Integer s2 ) {
//        System.out.println(s2);
//        this.fullName = s[0][1]+s[1][0]+""+s1;
//    }



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


    public DTOClass createDTOClass(){
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