package com.sra.core.exceptions.exercise7;

public class Driver {
    public static void main(String[] args) {
        try {
            UserService.getUser(99);
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
    }
}
