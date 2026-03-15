package com.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(10);
        hashset.add(20);
        hashset.add(30);
        hashset.add(10);
        hashset.add(40);
        hashset.add(20);
        System.out.println(hashset);
    }
}