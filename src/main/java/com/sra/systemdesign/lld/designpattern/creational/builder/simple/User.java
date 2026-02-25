package com.sra.systemdesign.lld.designpattern.creational.builder.simple;

public class User {
    private String name;
    private String PhoneNumber;

    // optional
    private String email;
    private String address;
    private int age;

    private User(Builder builder){
        this.name = builder.name;
        this.PhoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
    }

    public String name(){return name;}
    public String phoneNumber(){return PhoneNumber;}
    public String email(){return email;}
    public String address(){return address;}
    public int age(){return age;}

    public static Builder builder(String name, String phoneNumber){
        return new Builder(name,phoneNumber);
    }

    public static final class Builder {
        private String name;
        private String phoneNumber;

        // optional
        private String email="";
        private String address="";
        private int age=0;

        private Builder(String name,String phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}
