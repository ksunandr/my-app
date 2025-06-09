package com.mycompany.app;


import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TClass {

/*******************************/

    @InTestsMock(value = DTOClass.class, method = "getFullName", stringReturnValues = "diffy4")
    public boolean checkStringReturnValues(DTOClass dto) {

        return dto.createDTOClass().getFullName().equals("diffy");
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", returnValueFactory = "com.mycompany.app.Factory.methodWithNoParams2", decision = MockDecision.REQUIRED)
    public boolean checkReturnValueFactory(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }
    /*******************************/

///MUST NOT WORK: throwException = DTOClass.class - invalid ****
//    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = DTOClass.class, decision = MockDecision.REQUIRED)
//    public boolean check3(DTOClass dto) {
//        return dto.createDTOClass().getFullName().equals("diffy");
//    }


    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = RuntimeException.class, decision = MockDecision.REQUIRED)
    public boolean checkThrowExceptionRuntimeException(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = IllegalArgumentException.class, decision = MockDecision.REQUIRED)
    public boolean checkThrowExceptionIllegalArgumentException(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }
///*** can find factory for that as the best option try with eletted the factory
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = MyException.class, decision = MockDecision.REQUIRED)
    public boolean checkThrowExceptionMyException(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    ///THIS IS NOT SUPPORTED
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwException = NullPointerException.class, decision = MockDecision.REQUIRED)
    public boolean checkThrowExceptionNullPointerException(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }


    /*******************************/

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory ="com.mycompany.app.Factory.testEx2", decision = MockDecision.REQUIRED)
    public boolean check1(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    /******** testEx312 doesnt exists***********/
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory ="com.mycompany.app.Factory.testEx312", decision = MockDecision.REQUIRED)
    public boolean check2(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory ="com.mycompany.app.Factory.testEx312")
    public boolean check22(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2WithDTOClass", decision = MockDecision.REQUIRED)
    public boolean check7(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    ///THIS IS NOT SUPPORTED
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2WithNullPointer", decision = MockDecision.REQUIRED)
    public boolean check8(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }
    ///THIS IS NOT SUPPORTED
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2WithNullPointerwithMessage", decision = MockDecision.REQUIRED)
    public boolean check10(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }
    ///THIS IS NOT SUPPORTED
    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2WithNullPointerAndDTOClass", decision = MockDecision.REQUIRED)
    public boolean check9(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

    @InTestsMock(value = DTOClass.class, method = "createDTOClass", throwExceptionFactory = "com.mycompany.app.Factory.testEx2WithRunTimeAndDTOClass", decision = MockDecision.REQUIRED)
    public boolean check11(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }





}
