package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;

public class ClassUnderTest {

    /// // ///////////////////////////////////
    /// the previous cases
    /**
     * InTestsMock.stringReturnValues
     * */
    @InTestsMock(value = DTOClass.class,
            method = "getFullName",
            stringReturnValues = "diffy4")
    public boolean ifFullNameIsDiffy(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    /// // ///////////////////////////////////
/**
 * InTestsMock.returnValueFactory
 * */
    @InTestsMock(
            value = DTOClass.class,
            method = "createDTOClass",
            returnValueFactory = "com.mycompany.app.Factory.createDTOClass2",
            decision = MockDecision.REQUIRED)
    public boolean ifFullNameIsDiffy2(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }















    /**
     * How to test exceptions
     * */

    public String getFullNameOrMessage0(DTOClass dto) {
        try {
            return dto.createDTOClass().getFullName();
        } catch (NullPointerException e) {
            return "This is a NullPointerException!";
        }
    }









    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = NullPointerException.class, decision = MockDecision.REQUIRED)
    public String getFullNameOrMessage(DTOClass dto) {
        try {
            return dto.createDTOClass().getFullName();
        } catch (NullPointerException e) {
            return "This is a NullPointerException!";
        }
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = MyException.class, decision = MockDecision.REQUIRED)
    public boolean throwException_MyException(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2", decision = MockDecision.REQUIRED)
    public boolean throwExceptionFactory_testEx2(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }


}
