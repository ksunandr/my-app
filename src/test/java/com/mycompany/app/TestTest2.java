package com.mycompany.app;

import net.bytebuddy.jar.asm.Type;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestTest2 {



    @Test

    void test() throws NoSuchMethodException {
        Method m = String.class.getMethod("valueOf", int.class);
        String owner = m.getDeclaringClass().getName();
        String desc  = Type.getMethodDescriptor(m);


        String fqn = owner + "." + m.getName() + ":" + desc;
        System.out.println(fqn);

        //java/lang/String.valueOf:(I)Ljava/lang/String;

        //com.example.ISBN.parse:(Ljava/lang/String;)Lcom/example/ISBN;

        //java.lang.String.valueOf:(I)Ljava/lang/String;
    }
}
