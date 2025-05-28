package com.mycompany.app;

public class SuperFactory {


    public static DTOClass forTest1(String[][] s, int i) {

        DTOClass dtoClass = new DTOClass();

        dtoClass.fullName = s[0][0]+s[1][1]+i;
        return dtoClass;
    }
}
