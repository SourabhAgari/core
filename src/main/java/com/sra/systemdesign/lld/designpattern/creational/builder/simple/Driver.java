package com.sra.systemdesign.lld.designpattern.creational.builder.simple;

public class Driver {
    public static void main(String[] args) {
        User user = User.builder("John", "1234567890")
                .address("Agari House Kulavoor Village")
                .email("john@example.com")
                .build();
        System.out.println(user.toString());

        User user2 = User.builder("John", "1234567890")
                .address("Agari House Kulavoor Village")
                .email("john@example.com")
                .age(30)
                .build();
        System.out.println(user2.toString());
    }
}
