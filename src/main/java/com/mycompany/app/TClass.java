package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;


public class TClass {

    @InTestsMock(DTOClass.class)
    public boolean ifMe(DTOClass dto) {
        return dto.getFullName().equals("Kseniia");
    }
}
