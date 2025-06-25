package com.mycompany.app;

import com.mycompany.app.DTOClass;



public class Factory  {

//
    public static DTOClass createDTOClass2(String s) {

        DTOClass dtoClass = new DTOClass(s, s);

       // dtoClass.fullName = s;
        return dtoClass;
    }
//
//
//    public static DTOClass createDTOClass3(int s) {
//
//        DTOClass dtoClass = new DTOClass();
//        if (s ==1 ) {
//            dtoClass = new DTOClass(s, s);
//        } else {
//
//             dtoClass = new DTOClass("diffy", "diffy");
//
//        }
//        return dtoClass;
//    }

    public static DTOClass createDTOClass4(int s, String s2) {

        DTOClass dtoClass ;
        if (s ==1 ) {
            dtoClass = new DTOClass("di", "ffy");
        } else {

            dtoClass = new DTOClass(s2, s2);

        }
        return dtoClass;
    }
}









