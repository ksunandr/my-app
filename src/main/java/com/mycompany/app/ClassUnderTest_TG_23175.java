package com.mycompany.app;


import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;


@InTestsMock(value = DTOClass.class,
        method = "getFullName",
        stringReturnValues = "FORBIDDENdiffy",
        decision = MockDecision.FORBIDDEN
)
public class ClassUnderTest_TG_23175 {


    @InTestsMock(value = DTOClass.class,
            decision = MockDecision.REQUIRED)
    public boolean ifFullNameIsDiffy(DTOClass dto) {
        return dto.getFullName().equals("diffy");
    }


    @InTestsMock(value = DTOClass.class,
            method = "getFullName",
            stringReturnValues = "notdiffy3")
    public boolean ifFullNameIsDiffy22(DTOClass dto) {
        return dto.getFullName().equals("diffy");
    }


