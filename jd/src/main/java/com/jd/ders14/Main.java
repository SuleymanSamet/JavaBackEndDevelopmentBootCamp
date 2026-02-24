package com.jd.ders14;

import java.util.Scanner;

public class Main {
    //değiştirilmemeli
    static final String MESSAGE="Uygulamaya hoşgeldiniz";
    //değiştirilmemeli
    static final double PI=3.14;
    public static void main(String[] args) {
        //final sabit değişkenler
        Scanner scanner = new Scanner(System.in);
        System.out.println(MESSAGE);
        System.out.println("Çap giriniz: ");
        int r=scanner.nextInt();
        double result= PI*r;
        System.out.println(result);

        final char karakter;
        karakter='b';
        //bundan sonra sabit b dir
        //karakter='c'; hata verir


    }

}
