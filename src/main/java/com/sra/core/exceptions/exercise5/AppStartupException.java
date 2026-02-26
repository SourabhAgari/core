package com.sra.core.exceptions.exercise5;

public class AppStartupException extends Exception{
    public AppStartupException(String message){
        super(message);
    }

    public AppStartupException(String message, Throwable cause){
        super(message, cause);
    }
}
