package com.jd.ders16;

import java.util.Scanner;

public class Main {
    //erşim belirleyici - static/nonstatic -return type - method ismi - parametre
    
    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number =scanner.nextInt();
        return number;

    }
    public static void main(String[] args) {
        int sayi=getNumber();
        int sayi1=getNumber();

        int topla=sayi+sayi1;
        System.out.println(topla);

    }
}
