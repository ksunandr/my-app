package com.mycompany.app.returnValueFactory;

import com.diffblue.cover.annotations.InTestsMock;

public class ClassTOTEST {

    @InTestsMock(
            value = UserService.class,
            method = "getName",
            stringReturnValues = {"TestUser"}
    )
    @InTestsMock(
            value = UserService.class,
            method = "getAge",
            intReturnValues = {25}
    )
    @InTestsMock(
            value = AccountService.class,
            method = "getAccount",
            returnValueFactory = "com.mycompany.app.returnValueFactory.Factory.createTestAccount"
    )
    public boolean isValid(UserService user, AccountService account) {
        return "TestUser".equals(user.getName())
                && user.getAge() >= 18
                && account.getAccount().getId().startsWith("test-");
    }

}
