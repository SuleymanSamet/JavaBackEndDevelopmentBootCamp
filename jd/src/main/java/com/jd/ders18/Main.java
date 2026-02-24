package com.jd.ders18;

import java.util.Scanner;

public class Main {
    public static void run(){
        int sayi=0;
        for(int i=1;i<=3;i++){
            System.out.print(i+".sayıyı giriniz :");
            sayi=sayiGetir();
            if(sayiPoziifMi(sayi)){
                sayi+=sayi;
            }
        }
        System.out.println("Toplam :"+sayi);

    }
    public static int sayiGetir(){
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        return sayi;
    }
    public static boolean sayiPoziifMi(int sayi){
        if(sayi>0){
            return true;
        }else{
            return false;   
        }
    }
    public static void main(String[] args) {
        run();
    }

}
