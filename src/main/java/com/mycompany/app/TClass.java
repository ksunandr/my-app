package com.mycompany.app;

import com.diffblue.cover.annotations.InTestsMock;

import java.util.StringJoiner;

public class TClass {

    @InTestsMock(App.class)
    public boolean ifOne2(App app) {
        return app.ifOne(1);
    }
}
