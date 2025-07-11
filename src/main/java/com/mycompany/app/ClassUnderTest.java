package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;


public class ClassUnderTest {


    public boolean ifFullNameIsDiffy(DTOClass dto) {
        return dto.getFullName().equals("diffy");
    }


    @InTestsMock(
            value = DTOClass.class,
            method = "createDTOClass",
            returnValueFactory = "com.mycompany.app.Factory.createDTOClass4",
            decision = MockDecision.REQUIRED)
    public boolean createAndIfFullNameIsDiffy(DTOClass dto) {
        return dto.createDTOClass("diffy").getFullName().equals("diffy");
    }

}
