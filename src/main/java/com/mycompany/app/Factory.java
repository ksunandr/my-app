package com.mycompany.app;

public class Factory extends SuperFactory {



    public static DTOClass methodWithNoParams() {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = "s";
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



//    public static Factory forTest(String s) {
//        Factory dtoClass = new Factory();
//
//        System.out.println(s);
//        // if (true)   throw new  RuntimeException();
//      //  dtoClass.fullName = s;
//        return dtoClass;
//    }

}
