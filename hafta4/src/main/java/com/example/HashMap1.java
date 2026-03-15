package com.example;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Beste",52);
        hashMap.put("Empae", 20);
        hashMap.put("Ucay", 55);
        System.out.println(hashMap.get("Beste"));
        System.out.println(hashMap);
        hashMap.remove("Empae");
        System.out.println(hashMap);
    }
}
