package com.mycompany.app;

public class Factory extends SuperFactory {



    public static DTOClass methodWithNoParams() {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = "s";
        return dtoClass;
    }

    public static DTOClass methodWithNoParams2() {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = "s2";
        return dtoClass;
    }


    public static DTOClass methodWithParams(String s, String s2) {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s+s2;
        return dtoClass;
    }
//

    public static DTOClass methodWithNoParams(Integer s) {
        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s.toString();
        return dtoClass;
    }

    public static DTOClass methodWithNoParams(String s) {
        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s;
        return dtoClass;
    }


//    public static RuntimeException getRuntimeException() {
//
//
//        return new RuntimeException("ksan ksan");
//    }
//
//    public static RuntimeException get21212() {
//
//
//        return new RuntimeException("ksan ksan33233");
//    }

    public static MyException testEx1() {

        return     new MyException("111111");
    }


    public static MyException testEx2() {

        return     new MyException("222222222222222222");
    }


    public static MyException testEx2WithDTOClass() {

        return     new MyException("111111",  new DTOClass());
    }


    public static MyException testEx2WithNullPointer() {

        return     new MyException("111111", new NullPointerException());
    }

    public static MyException testEx2WithNullPointerwithMessage() {

        return     new MyException("111111", new NullPointerException("withMessage"));
    }

    public static MyException testEx2WithRunTimeAndDTOClass() {

        return     new MyException("111111", new RuntimeException("RuntimeExceptionksan"), new DTOClass());
    }


    public static MyException testEx2WithNullPointerAndDTOClass() {

        return     new MyException("111111", new NullPointerException(), new DTOClass());
    }


//    public static Factory forTest(String s) {
//        Factory dtoClass = new Factory();
//
//        System.out.println(s);
//        // if (true)   throw new  RuntimeException();
//      //  dtoClass.fullName = s;
//        return dtoClass;
//    }

}
