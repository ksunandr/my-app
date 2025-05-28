package com.mycompany.app;


import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TClass {



    @InTestsMock(value = DTOClass.class, method = "createDTOClass", returnValueFactory = "com.mycompany.app.Factory.methodWithParams", decision = MockDecision.REQUIRED)
    public boolean ifMe(DTOClass dto) {
        return dto.createDTOClass().getFullName().equals("Kseniia");
    }


}
