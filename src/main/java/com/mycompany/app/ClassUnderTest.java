package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;
import com.diffblue.cover.annotations.MockDecision;
import com.mycompany.app.returnValueFactory.AccountService;
import com.mycompany.app.returnValueFactory.UserService;

@InTestsMock(value = DTOClass.class,
        method = "getFullName",
        stringReturnValues = "FORBIDDENdiffy",
decision = MockDecision.FORBIDDEN
)

//@InTestsMock(value = DTOClass.class,
//        method = "getFullName",
//        stringReturnValues = "notdiffy1")

public class ClassUnderTest {


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


//    /// // ///////////////////////////////////
//    /**
//     * InTestsMock.returnValueFactory
//     */
//    @InTestsMock(
//            value = DTOClass.class,
//            method = "createDTOClass",
//            returnValueFactory = "com.mycompany.app.Factory.createDTOClass2",
//            decision = MockDecision.REQUIRED)
//    public boolean ifFullNameIsDiffy2(DTOClass dto) {
//        return dto.createDTOClass().getFullName().equals("diffy");
//    }
//
//
//    /**
//     * How to test exceptions
//     */
//
//    public String getFullNameOrMessage0(DTOClass dto) {
//        try {
//            return dto.getFullName();
//        } catch (NullPointerException e) {
//            return "This is a NullPointerException!";
//        }
//    }
//
//
//    /**
//     * please throwException: NullPointerException for tests
//     */
//    @InTestsMock(value = DTOClass.class,
//            method = "getFullName",
//            throwException = MyException.class,
//            decision = MockDecision.FORBIDDEN)
//    public String getFullNameOrMessage(DTOClass dto) {
//        try {
//            return dto.getFullName();
//        } catch (NullPointerException e) {
//            return "This is a NullPointerException!";
//        }
//    }
//
//
//    /**
//     * please use throwExceptionFactory for tests
//     */
//    @InTestsMock(value = DTOClass.class,
//            method = "createDTOClass",
//            throwExceptionFactory = "com.mycompany.app.Factory.testEx2",
//            decision = MockDecision.REQUIRED)
//    public String getFullNameOrCustomMessage(DTOClass dto) {
//        try {
//            return dto.createDTOClass().getFullName();
//        } catch (MyException e) {
//            return "This is a custom Exception!";
//        }
//    }
//
//
//    @InTestsMock(
//            value = UserService.class,
//            method = "getName",
//            stringReturnValues = {"TestUser"},
//            decision = MockDecision.REQUIRED
//    )
//    @InTestsMock(
//            value = UserService.class,
//            method = "getAge",
//            intReturnValues = {25},
//            decision = MockDecision.REQUIRED
//    )
//    @InTestsMock(
//            value = AccountService.class,
//            method = "getAccount",
//            returnValueFactory = "com.mycompany.app.returnValueFactory.Factory.createTestAccount",
//            decision = MockDecision.REQUIRED
//    )
//    public boolean isValid(UserService user, AccountService account) {
//        return "TestUser".equals(user.getName())
//                && user.getAge() >= 18
//                && account.getAccount().getId().startsWith("test-");
//    }

}
