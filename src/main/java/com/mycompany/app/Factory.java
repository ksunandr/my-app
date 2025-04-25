package com.mycompany.app;

public class Factory {



   public static DTOClass createDTOClassForTest(String s) {

       DTOClass dtoClass = new DTOClass();

       dtoClass.fullName = s;
        return dtoClass;
    }

    public static DTOClass createDTOClassForTest(String s,String s2) {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s;
        return dtoClass;
    }
}
