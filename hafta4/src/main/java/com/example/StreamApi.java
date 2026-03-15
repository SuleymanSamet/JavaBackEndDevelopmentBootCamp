package com.example;

import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> hisseler = new ArrayList<>();
        hisseler.add("beste");
        hisseler.add("empae");
        hisseler.add("endae");
        hisseler.add("meysu");
        hisseler.add("netcad");
        hisseler.add("ucay");

        hisseler.stream().filter(h->h.startsWith("e")).forEach(System.out::println);
    }
}
