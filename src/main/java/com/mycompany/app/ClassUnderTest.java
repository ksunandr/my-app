package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;
import com.mycompany.app.returnValueFactory.AccountService;
import com.mycompany.app.returnValueFactory.UserService;


public class ClassUnderTest {



    public boolean ifFullNameIsDiffy1(DTOClass dto) {
        return dto.getFullName().equals("diffy");
    }


    @InTestsMock(
            value = DTOClass.class,
            method = "createDTOClass",
            returnValueFactory = "com.mycompany.app.Factory.createDTOClass2",
            decision = MockDecision.REQUIRED)
    public boolean ifFullNameIsDiffy2(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }


    @InTestsMock(
            value = DTOClass.class,
            method = "createDTOClass",
            returnValueFactory = "com.mycompany.app.Factory.createDTOClass4",
            decision = MockDecision.REQUIRED)
    public boolean ifFullNameIsDiffy3(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("diffy");
    }

}
