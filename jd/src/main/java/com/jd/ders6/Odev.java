package com.jd.ders6;

import java.util.Scanner;

public class Odev {
    //Manav kasa programı 
    //kilo değerine gore toplam tutarı ekrana yazdıran program 
    //meyve ve kg fiyatı domates=44,95 biber=89.95 patlıcan=69,95;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Domates kilosu: ");
        double domatesKg=scanner.nextDouble();
        System.out.println("Biber kilosu: ");
        double biberKg=scanner.nextDouble();
        System.out.println("Patlıcan  Kilosu: ");
        double patlıcanKg=scanner.nextDouble();

        double domatesFiyat=44.95;
        double biberFiyat=89.95;
        double patlıcanFiyat=69.95;

        System.out.println("Domates toplam fiyat: "+domatesKg*domatesFiyat);
        System.out.println("Biber toplam fiyat: "+biberKg*biberFiyat);
        System.out.println("Patlıcan toplam fiyat: "+patlıcanKg*patlıcanFiyat);

    }
}
