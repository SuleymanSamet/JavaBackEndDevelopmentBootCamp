package com.mikroservice.CollectionSetx;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


class ListData{
    public void HashSetValue(){
        HashSet<String> setList=new HashSet<>();
        setList.add("java");
        setList.add("spring");
        setList.add("se");
        setList.add("me");
        setList.add("java");
        System.out.println("Eleman sayısı: "+setList.size());
        System.out.println("eleman boş mu :"+setList.isEmpty());
        System.out.println("ilk eleman sil:"+setList.remove(0));

        System.out.println("java elemanı var mı :"+setList.contains("java"));
    }
    public void linkedHashSet(){
        LinkedHashSet<String> list=new LinkedHashSet<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");
        System.out.println("Eleman sayısı: "+list.size());
        System.out.println("eleman boş mu :"+list.isEmpty());
        System.out.println("ilk eleman sil:"+list.remove(0));
        System.out.println("java elemanı var mı :"+list.contains("java"));

    }

    public static Set<String> hashSetData(){
        Set<String> list=new HashSet<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");
        return list;
    }

    public static Set<String> linkedHashDataset(){
        Set<String> list=new LinkedHashSet<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");
        return list;
    }

    public void forEachLoop(){
        Set<String> list=new HashSet<>();
        list.add("java");
        list.add("spring");
        list.add("se");
        list.add("me");
        list.add("java");

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
        listvalue.HashSetValue();
        listvalue.forEachLoop();
        
    }
    
}
