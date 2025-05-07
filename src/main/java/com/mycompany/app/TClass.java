package com.mycompany.app;




public class TClass {

    //@InTestsMock(value = DTOClass.class, decision = MockDecision.RECOMMENDED)
    public boolean ifMe(DTOClass dto) {

        return dto.getFullName().equals("Kseniia");
    }

}
