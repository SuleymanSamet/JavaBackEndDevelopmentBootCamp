package com.jd.ders20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] sayiDizisi=new int[3];//dizi oluşturma
        sayiDizisi[0]=10;//dizi elemanına değer verme
        sayiDizisi[1]=20;
        sayiDizisi[2]=30;

        int elemanSayisi=scanner.nextInt();
        int[] sayiDizisi2=new int[elemanSayisi];
        System.out.println("Girdiniz dize sayısı:"+elemanSayisi);
        for(int i=0;i<sayiDizisi2.length;i++){
            int diziElemanları=scanner.nextInt();
            sayiDizisi2[i]=diziElemanları;
                
        }
        for (int i : sayiDizisi2) {
            //foreach ile dizi elemanlarını gorme
            System.out.print(i+" ");
        }
        
        
        


    }

}
