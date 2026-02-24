package com.jd.ders19;

import java.util.Scanner;

public class Main {
    public static void run(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç sayı kıyaslanacak");
        int[] sayilar=new int[scanner.nextInt()];
        
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;
        for(int i=0;i<sayilar.length;i++){
            
            System.out.println((i+1)+". sayıyı girin");
            sayilar[i]=scanner.nextInt();
            if(max<sayilar[i]){
                max=sayilar[i];
            }
            if(min>sayilar[i]){
                min=sayilar[i];
            }   
        }
        System.out.println("Min sayi:"+min);
        System.out.println("Max sayi:"+max);


    }
    public static void main(String[] args) {
        //klavyeden girilen n tane sayma sayısının en büyük ve en kücük sayıları bulan 
        //bu sayıları ekrana yazsın
        run();    
    }

}
