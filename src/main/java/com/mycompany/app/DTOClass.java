package com.mycompany.app;

public class DTOClass {

    public DTOClass() {
    }
    public DTOClass(String fullName) {
        this.fullName = fullName;
    }


    public DTOClass(String fullName, String someOtherField) {
        System.out.println(someOtherField);
        this.fullName = fullName+someOtherField;
    }

   // @InterestingMockReturnValues(returnValue="Diffy")
    public String getFullName() {
        return fullName;
    }


    public String fullName;
}
