package com.mycompany.app.returnValueFactory;

public class AccountService {
    public Account getAccount() {
        return new Account("default-id");
    }


}
