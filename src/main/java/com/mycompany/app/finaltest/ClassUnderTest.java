package com.mycompany.app.finaltest;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;


public class ClassUnderTest {


    @InTestsMock(
            value = DTOClass.class,
            decision = MockDecision.REQUIRED)
    public boolean createAndIfFullNameIsDiffy(DTOClass dto) {
        return dto.createDTOClass("diffy").getFullName().equals("diffy");
    }

}
