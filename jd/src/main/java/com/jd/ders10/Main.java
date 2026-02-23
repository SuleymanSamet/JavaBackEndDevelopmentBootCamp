package com.jd.ders10;

public class Main {
    public static void main(String[] args) {
        // == ve equals farkı 
        String metin="Merhaba";
        String kelime="Merhaba";
        String kelime2=new String("Merhaba");

        if(metin==kelime){//bu referans numarasına bakar
            System.out.println("kelimeler eşit");
        }else{
            System.out.println("Kelimeler eşit değil");
        }
        if(metin.equals(kelime)){
            System.out.println("Kelimeler aynı");
        }else{
            System.out.println("Kelimeler aynı değil");
        }
        System.out.println("----------------");
        //yeni bir belleğe alındı için kelime2 hashkodu farklı
        if(metin==kelime2){
            System.out.println("kelimeler eşit");
        }else{
            System.out.println("Kelimeler eşit değil");
        }
        if(metin.equals(kelime2)){
            System.out.println("Kelimeler aynı");
        }else{
            System.out.println("Kelimeler aynı değil");
        }

    }

}
