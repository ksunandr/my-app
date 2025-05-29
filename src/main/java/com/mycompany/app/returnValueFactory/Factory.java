package com.mycompany.app.returnValueFactory;

public class Factory {
    public static Account createTestAccount() {
        return new Account("test-123");
    }

    public static Account createTestAccount2() {
        return new Account("test-2");
    }
}
