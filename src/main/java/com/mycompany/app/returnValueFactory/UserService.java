package com.mycompany.app.returnValueFactory;

public class UserService {
    private final String fullName;

    public UserService(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return "DefaultUser";
    }

    public int getAge() {
        return 0;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLanguage() {
        return "Eng";
    }
}
