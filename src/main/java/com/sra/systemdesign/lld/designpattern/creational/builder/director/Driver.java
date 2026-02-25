package com.sra.systemdesign.lld.designpattern.creational.builder.director;

public class Driver {
    public static void main(String[] args) {
        UserDirector director = new UserDirector();
        User admin = director.buildAdmin(User.builder("John").age("20"));
        User user = director.buildUser(User.builder("Sourabh").age("20"));

        System.out.println(admin.toString());
        System.out.println(user.toString());
    }
}
