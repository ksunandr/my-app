package com.mycompany.app;

public class Factory  {

    public static DTOClass createDTOClass4(int s, String s2) {

        DTOClass dtoClass ;
        if (s ==1 ) {
            dtoClass = new DTOClass("di", "ffy");
        } else if (s2.equals("diffy")) {

            dtoClass = new DTOClass("di", "ffy");

        } else {
            dtoClass = new DTOClass("test", "test");
        }
        return dtoClass;
    }
}









