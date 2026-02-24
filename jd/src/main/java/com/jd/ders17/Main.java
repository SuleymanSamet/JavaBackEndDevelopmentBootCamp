package com.jd.ders17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan 3 sayı al sayı pozitifse topla
        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        for(int i=1;i<=3;i++){
            System.out.print(i+".sayıyı giriniz :");
            sayi=scanner.nextInt();
            if(sayi>0){
                sayi+=sayi;
            }
        }
        System.out.println(sayi);
    }

}
