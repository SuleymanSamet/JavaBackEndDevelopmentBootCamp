package com.jd.ders21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        double cikolata=12.60;
        double kola=40.0;
        double cips=33.0;
        double dondurma=20.0;
        double bulgur=10.0;

        int cikolataA=scanner.nextInt();
        int kolaA=scanner.nextInt();
        int cipsA=scanner.nextInt();
        int dondurmaA=scanner.nextInt();
        int bulgurA=scanner.nextInt();
        double toplam=(cikolata*cikolataA+kola*kolaA+cips*cipsA+dondurma*dondurmaA+bulgur*bulgurA);
        System.out.println("Toplam tutar :"+toplam);
        /*
        Pratik - Market Program


Şimdiye kadar öğrendiklerinizle
1- Println() (str, float vb.) ve \n+String+String vb.)
2- Scanner
3- Değişkenler / veritipleri
4- if-else
5- switch-case

=> market.java
=> classlar.java */
    }

}
