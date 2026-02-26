package com.sra.core.exceptions.exercise6;

import java.util.concurrent.ThreadLocalRandom;

public class DatabaseSimulator {
    public static void getConnection() throws DBConnectionException,ClassNotFoundException
    {
        int random = ThreadLocalRandom.current().nextInt(0, 3);
        switch (random)
        {
            case 0:
                throw new DBConnectionException("Connection failed");
            case 1:
                throw new ClassNotFoundException("Class not found");
            case 2:
                System.out.println("Connection successful");
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            try {
                getConnection();
            } catch (DBConnectionException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finally block");
            }
        }
    }
}
