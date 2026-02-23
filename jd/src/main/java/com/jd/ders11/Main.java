package com.jd.ders11;

import java.util.Scanner;

public class Main {
    //Switch-case
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("0-5 Arasında bir sayı girin :");
        int choise=scanner.nextInt();
        //switch double boolean da çalışmıyor
        switch (choise) {
            case 0:
                System.out.println("Sayı 0 ");
                break;
            case 1:
                System.out.println("Sayı 1 ");
                break;
            case 2:
                System.out.println("Sayı 2 ");
                break;
            case 3:
                System.out.println("Sayı 3 ");
                break;
            case 4:
                System.out.println("Sayı 4 ");
                break;
            case 5:
                System.out.println("Sayı 5 ");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız");
                break;
        }
    }

}
