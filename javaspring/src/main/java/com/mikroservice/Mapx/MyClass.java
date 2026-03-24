package com.mikroservice.Mapx;


import java.util.HashMap;



class ListData{
    public void HashMapData(){
        HashMap<String,String> setList=new HashMap<>();
        setList.put("1","JAVA");
        setList.put("2","spring");
        setList.put("3","se");
        setList.put("4","me");
        setList.put("4","java");
        System.out.println(setList.get("1"));
        System.out.println("Eleman sayısı: "+setList.size());
        System.out.println("eleman boş mu :"+setList.isEmpty());
        //System.out.println("ilk eleman sil:"+setList.remove("1"));
        //System.out.println(setList.get("1"));
        System.out.println("contain key:"+ setList.containsKey("1"));
        System.out.println("contain value:"+ setList.containsValue("JAVA"));

        //KEY
        for(String key :setList.keySet()){
            System.out.println(key);
        }
        //value
        for(String value :setList.values()){
            System.out.println(value);
        }
        //key-value
        for(String key :setList.keySet()){
            System.out.println(key+" =>"+setList.get(key));
        }     
    }  
}
public class MyClass {
    public static void main(String[] args) {
        ListData listvalue = new ListData();
        listvalue.HashMapData();
        
    }
    
}
