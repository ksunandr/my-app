package com.mycompany.app;


import com.diffblue.cover.annotations.InTestsMock;

/**
 * Hello world!
 *
 */ 
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "main test" );
//        System.out.println( maskString("Kseniia Andreeva")+" " +maskEmail("kseniia.andreeva@diffblue.com"));
//
//        System.out.println( "L Y <the@mail.ua>\n" );
//        System.out.println( maskString("L Y")+" " +maskEmail("the@mail.ua"));
//
//        System.out.println( "L Y exam@x.com" );
//        System.out.println( maskString("L Y")+" " +maskEmail("exam@x.com"));

    }

    public boolean ifYes(String s) {
        return "Yes".equals(s);
    }

     @InTestsMock(Number.class)
    public boolean ifOne(Number n) {
        return n.intValue() == 1;
    }

    @InTestsMock(Number.class)
    public static String ifOne2(Number number) {
        return String.valueOf(number.intValue());
    }


}
