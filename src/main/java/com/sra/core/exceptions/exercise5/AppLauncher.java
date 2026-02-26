package com.sra.core.exceptions.exercise5;

public class AppLauncher {
    public static void readConfig(){
        throw new RuntimeException("Error reading config");
    }

    public static void startApp() throws AppStartupException{
        try {
            readConfig();
        } catch (RuntimeException e) {
            throw new AppStartupException("Error starting app", e);
        }
    }

    public static void main(String[] args) {
        try {
            startApp();
        } catch (AppStartupException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
