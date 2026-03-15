package com.girisyonetimsistemi;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Kisi{
    private String ad;
    private String soyad;

    public Kisi(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String ad){
        if(ad.length()>0){
            this.ad=ad;
            System.out.println("İsim başarılı şekilde kayıt edildi");
        }else{
            System.out.println("Hatalı işlem yaptınız");
        }
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        if(ad.length()>0){
            this.soyad = soyad;
            System.out.println("İsim başarılı şekilde kayıt edildi");
        }else{
            System.out.println("Hatalı işlem yaptınız");
        }
    }
    
    public void bilgileriGoster(){
        System.out.println("Çalışan ad:"+getAd()+" soyad:"+getSoyad());
    }
}
class Ogrenci extends Kisi implements GirisYapabilir{
    private int not;
    public static int ogrenciSayisi=0;
    public Ogrenci(String ad,String soyad,int not){
        super(ad, soyad);
        setNot(not); 
        ogrenciSayisi++;
    }
    public int getNot(){
        return not;
    }
    public void setNot(int not){
        if(not>0&&not<=100){
            this.not=not;
        }else{
            this.not=0;
            System.out.println("Hata : not 0-100 arasında olmalı not 0 olarak atandı");
        }
    }
    @Override
    public void bilgileriGoster(){
        System.out.println("Öğrenci : ad: "+getAd()+" Soyad : "+getSoyad()+"notu : "+getNot());
    }
    @Override
    public void sistemeGirisYap() {
        // TODO Auto-generated method stub
        System.out.println("Öğrenci paneline yönlendiriliyor...");
    }
}
class Ogretmen extends Kisi implements GirisYapabilir{
    private String brans;
    public Ogretmen(String adi,String soyad,String brans){
        super(adi, soyad);
        this.brans=brans;
    }
    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        if(brans.length()>0){
            this.brans=brans;
        }else{
            System.out.println("Öğretmen : ad:"+getAd()+"Soyad : "+getSoyad()+" Branş: "+getBrans());
        }
    }
    @Override
    public void bilgileriGoster(){
        System.out.println("Öğretmen : ad:"+getAd()+"Soyad : "+getSoyad()+" Branş: "+getBrans());
    }
    @Override
    public void sistemeGirisYap() {
        // TODO Auto-generated method stub
        System.out.println("Öğretmen not giriş sistemine yönlendiriliyor..");
    }
}
public class Main {
    //Giriş ve yetkilendirme sistemi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Öğrenci notunu giriniz: ");
            int girilenNot = scanner.nextInt(); // Kullanıcı harf girerse burada hata kopar!
            
            Ogrenci ogr = new Ogrenci("Süleyman", "Yumuşak", girilenNot);
            ogr.sistemeGirisYap();
            ogr.bilgileriGoster();
            
        } catch (InputMismatchException e) {
            System.out.println("HATA: Lütfen sadece sayısal bir değer giriniz!");
        } finally {
            System.out.println("İşlem tamamlandı.");
            scanner.close();
        }
    
    }
}