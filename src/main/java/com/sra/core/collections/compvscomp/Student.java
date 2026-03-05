package com.sra.core.collections.compvscomp;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double marks;
    private String city;

    public Student(String name, int age, double marks, String city) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Student o) {
       return Double.compare(this.marks, o.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }
}

