package com.sra.systemdesign.lld.designpattern.creational.builder.director;

public class UserDirector {
    public User buildAdmin(User.Builder builder){
        return builder.role("admin").build();
    }

    public User buildUser(User.Builder builder){
        return builder.role("user").build();
    }
}
