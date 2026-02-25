package com.sra.systemdesign.lld.designpattern.creational.builder.director;

public class User {
    private String name;
    private String age;
    private String role;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.role = builder.role;
    }

    public String name() {return name;}
    public String age() {return age;}
    public String role() {return role;}

    public static Builder builder(String name){
        return new Builder(name);
    }

    public static final class Builder {
        private String name;
        private String age = "0";
        private String role = "user";

        public Builder(String name){
            this.name = name;
        }

        public Builder age(String age){
            this.age = age;
            return this;
        }

        public Builder role(String role){
            this.role = role;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
