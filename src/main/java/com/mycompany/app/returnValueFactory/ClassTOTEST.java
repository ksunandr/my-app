package com.mycompany.app.returnValueFactory;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.InTestsMockConstruction;
import com.diffblue.cover.annotations.MockDecision;
import com.mycompany.app.Constants;

import java.util.Random;

public class ClassTOTEST {





    @InTestsMock(
            value = UserService.class,
            method = "getName",
            stringReturnValues = {"TestUser"},
            decision = MockDecision.REQUIRED
    )
    @InTestsMock(
            value = UserService.class,
            method = "getAge",
            intReturnValues = {25}
            ,
            decision = MockDecision.REQUIRED
    )
    @InTestsMock(
            value = AccountService.class,
            method = "getAccount",
            returnValueFactory = "com.mycompany.app.returnValueFactory.Factory.createTestAccount"
            ,
            decision = MockDecision.REQUIRED
    )
    public boolean isValid(UserService user, AccountService account) {
        return "TestUser".equals(user.getName())
                && user.getAge() >= 18
                && account.getAccount().getId().startsWith("test-");
    }
    @InTestsMock(value=UserService.class, decision=MockDecision.REQUIRED, method="getFullName", stringReturnValues = "French")
    @InTestsMock(value=UserService.class, decision=MockDecision.RECOMMENDED, method="getLanguage", stringReturnValues = "EngFrench222")
    public static String methodUnderTest(UserService person) {
                if (Constants.s.equals(person.getLanguage())) return "TEst1";
                if (Constants.e.equals(person.getLanguage())) return "TEst2";
        if ((Constants.e+Constants.s+"222").equals(person.getFullName()) ) return "TEst3";
        if ((Constants.e+Constants.s+"2").equals(person.getLanguage()) ) return "test3";

return "";

    }

    @InTestsMock(value=UserService.class, decision=MockDecision.REQUIRED, method="getFullName", stringReturnValues = "EngFrench222")
    @InTestsMock(value= UserService.class, decision=MockDecision.REQUIRED, method="getLanguage", stringReturnValues = "French")
    public static String methodUnderTest2(UserService person) {
       return person.getLanguage()+" "+person.getFullName();

    }

    @InTestsMock(value= UserService.class, decision=MockDecision.RECOMMENDED)
    @InTestsMock(value=UserService.class, decision=MockDecision.REQUIRED)
    public static String methodUnderTest22(UserService person) {
        return person.getLanguage()+" "+person.getFullName();

    }

    @InTestsMock(value= UserService.class, decision=MockDecision.RECOMMENDED)
    @InTestsMock(value= AccountService.class, decision=MockDecision.REQUIRED)
      public static String methodUnderTest3(UserService person, AccountService account) {
        return person.getLanguage()+" "+account.getAccount();

    }


    @InTestsMockConstruction(Random.class)
    @InTestsMockConstruction(Random.class)
    public static int methodUnderTest() {
        return new Random().nextInt();
    }

}
