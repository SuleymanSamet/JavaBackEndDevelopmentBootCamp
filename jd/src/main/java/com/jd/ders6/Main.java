package com.jd.ders6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Vücut kitle indeksi hesaplama
        //kilo/boy*boy
        Scanner scanner =new Scanner(System.in);
        System.out.println("Kilo giriniz :");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunuzu metre giriniz :");
        double boy=scanner.nextDouble();

        double vki=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : "+vki);

    }
}
