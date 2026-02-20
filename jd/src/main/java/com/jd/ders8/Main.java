package com.jd.ders8;

public class Main {
    public static void main(String[] args) {
        int age=17;
        if(age<18){
            System.out.println("Yaş 18 den kücüktür");
        }else if(age>=18&&age<35){
            System.out.println("Yaş 18 ve 35 arasındadır");
        }else{
            System.out.println("Yaş 35 den büyüktür");
        }
        //kayıt olma sistemi 13 yaş kücükler uygulamaya giremez 
        if(age<13){
            System.out.println("13 yaş altı kayıt olamaz");
        }else{
            System.out.println("Kayıt işlemi başarılı");
        }
        //kitap kiralama 18 yaş altı "18 yaş altı veli onayı gerekir"
        if(age<18){
            System.out.println("Kitap kiralamak için veli onayı gerekir");
        }else if(age<25){
            System.out.println("Öğrenci olmanız gerekmektedir");
        }else if(age<40){
            System.out.println("Öğretmen olmanız gerekmektedir");
        }else{
            System.out.println("Kitap kiralandı");
        }
    }
}
