package com.mikroservice.CollectionListx;

import java.util.ArrayList;
import java.util.LinkedList;

class ListData{
    public void arrayListValue(){
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");
        System.out.println("Eleman sayısı: "+list.size());
        System.out.println("ilk eleman :"+list.get(0));
        System.out.println("Son eleman :"+list.get(list.size()-1));
        System.out.println("eleman boş mu :"+list.isEmpty());
        System.out.println("ilk eleman sil:"+list.remove(0));
        System.out.println("ilk eleman :"+list.get(0));

        System.out.println("java elemanı var mı :"+list.contains("java"));
    }
    public void linkedListValue(){
        LinkedList<String> list=new LinkedList<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");
        System.out.println("Eleman sayısı: "+list.size());
        System.out.println("ilk eleman :"+list.get(0));
        System.out.println("Son eleman :"+list.get(list.size()-1));
        System.out.println("eleman boş mu :"+list.isEmpty());
        System.out.println("ilk eleman sil:"+list.remove(0));
        System.out.println("ilk eleman :"+list.get(0));

        System.out.println("java elemanı var mı :"+list.contains("java"));

    }
    public void forEachLoop(){
        LinkedList<String> list=new LinkedList<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");

        System.out.println("******for******");
        for(int i=0;i<list.size();i++){
            System.out.println("Eleman :"+list.get(i));
        }
        System.out.println("******foreach******");
        for(String temp : list){
            System.out.println("Eleman :"+temp);
        }
        System.out.println("******lamda foreach******");
        list.stream().forEach((temp)->{System.out.print(temp+" ");});
    }
}
public class MyClass {
    public static void main(String[] args) {
        ListData listvalue = new ListData();
        listvalue.arrayListValue();
        listvalue.linkedListValue();
        listvalue.forEachLoop();
        
    }
    
}
