package com.mikroservice.Genericsx;

import com.mikroservice.Main;

class Generic<T>{
    private String name;
    private T surName;
    public Generic(){

    }
    public Generic(String name,T surName){
        this.name=name;
        this.surName=surName;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public T getSurname(){
        return surName;
    }
    public void setSurname(T surName){
        this.surName=surName;
    }
}
public class MyClass {
    //Generics
    public static void main(String[] args) {
        Generic generic=new Generic();
        generic.setName("ALİ");
        generic.setSurname(44);
        generic.setSurname(44.60);
        generic.setSurname("Kılıç");
        System.out.println(generic.getName()+" "+generic.getSurname());
    }
    
    
}
