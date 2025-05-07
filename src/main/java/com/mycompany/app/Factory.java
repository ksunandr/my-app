package com.mycompany.app;

public class Factory {



    public static DTOClass forTest() {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = "s";
        return dtoClass;
    }



   public static DTOClass forTest(String[][] s, int i) {

       DTOClass dtoClass = new DTOClass();

       dtoClass.fullName = s[0][0]+s[1][1]+i;
        return dtoClass;
    }

    public static DTOClass forTest(String s, String s2) {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s+s2;
        return dtoClass;
    }
//

    public static DTOClass forTest(Integer s) {
        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s.toString();
        return dtoClass;
    }

    public static DTOClass forTest(String s) {
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
