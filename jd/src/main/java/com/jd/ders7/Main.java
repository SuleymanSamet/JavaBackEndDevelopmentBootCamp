package com.jd.ders7;

public class Main {
    public static void main(String[] args) {
        //Karşılaştırma operatörleri
        int age = 28;
        System.out.println(age == 28);
        System.out.println(age != 29);
        String message = "";
        if(age<18){
            message="young";
        }else if(age>18 && age<=45){
            message="adult";
        }else{
            message="old";
        }
        System.out.println(message);
        //&& bütün kosul dogru ise dogru
        //|| 1 dogru ise dogru
        //! tersi alır

    }

}
