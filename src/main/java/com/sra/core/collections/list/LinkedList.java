package com.sra.core.collections.list;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.addFirst(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(0,100);
        System.out.println(list);
    }
}
