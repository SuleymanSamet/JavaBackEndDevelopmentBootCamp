package com.jd.ders15;

import java.util.Scanner;

public class Main {
    public static int getNumber(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        return scanner.nextInt();
    }
    public static boolean isNegative(int number){
        if(number<0){
            System.out.println("Sayı negatif");
            return true;
        }else{
            System.out.println("Sayı pozitif");
            return false;
        }
    }
    public static void main(String[] args) {
        //metot 20
        int number=getNumber();
        isNegative(number);
    }

}
