package com.jd.ders9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :");
        int km=scanner.nextInt();
        System.out.println("Yaşınızı giriniz :");
        int yas=scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int secim=scanner.nextInt();

        double mesafeBasi=0.10; //50
        double yasIndirim=0.0;

        double normalTutar=km*mesafeBasi;


        double yasIndirimi=normalTutar*yasIndirim;
        double indirimliTutar=normalTutar-yasIndirimi;
        
        if(km>0&&yas>0&&(secim==1||secim==2)){
            if(yas<12){
                yasIndirim=0.50;
                yasIndirimi=normalTutar*yasIndirim;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println("Toplam tutar :"+indirimliTutar);
            }else if(yas>12&&yas<24){
                yasIndirim=0.10;
                yasIndirimi=normalTutar*yasIndirim;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println("Toplam tutar :"+indirimliTutar);
            }else if(yas>25&&yas<64){
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println("Toplam tutar :"+indirimliTutar);

            }else if(yas>65){
                yasIndirim=0.30;
                yasIndirimi=normalTutar*yasIndirim;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println("Toplam tutar :"+indirimliTutar);
            }
            if(secim==2){
                double secimIndirim=0.20;
                double gidisDonusIndirimi=indirimliTutar*secimIndirim;
                double toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
                System.out.println("Toplam gidiş dönüş tutarı :"+toplamTutar);
            }
        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
        
       
       
       
       
    }

}
