package com.mycompany.app;

public class MyException  extends  RuntimeException{

    String initMessage;
    String newMessage;
    DTOClass dtoClass;

    public MyException(String message, Throwable cause, DTOClass dtoClass) {

        super(message + "ksantest1", cause);
        this.initMessage = message;
        this.newMessage = message + "ksantest1";
        this.dtoClass = dtoClass;

    }


    public MyException(String message, Throwable cause) {

        super(message + "ksantest1", cause);
        this.initMessage = message;
        this.newMessage = message + "ksantest1";

    }

    public MyException(String message) {

        super(message + "ksantes2", new RuntimeException(message+ "ksantes3"));
        this.initMessage = message;
        this.newMessage = message + "ksantes2"+ "ksantes3";

    }

    public MyException() {
super("MyExceptionksan");

    }

    public MyException(String message, DTOClass dtoClass) {

        super(message + "ksantes2", new RuntimeException(message+ "ksantes3"));
        this.initMessage = message;
        this.newMessage = message + "ksantes2"+ "ksantes3";
        this.dtoClass = dtoClass;
    }

    @Override
    public String toString() {
        return super.toString()+dtoClass+" newMessage = "+newMessage;
    }
}
