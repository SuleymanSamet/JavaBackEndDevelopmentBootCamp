package com.example;

import java.util.ArrayList;

class Kisi{
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
            System.out.println("İsim başarılı bir şekilde kayıt edildi");
        }else{
            System.out.println("Hatalı işlem yaptınız");
        }
    }
    public String getSoyad(){
        return soyad;
    }
    public void setSoyad(String soyad){
        if(soyad.length()>0){
            this.soyad=soyad;
            System.out.println("soyad başarılı şekilde kayıt edildi");
        }else{
            System.out.println("Hatalı işlem yaptınız");
        }
    }
    public void bilgileriGoster(){
        System.out.println("Çalışan : "+getAd()+" soyad :"+getSoyad());
    }
}
class Ogrenci extends Kisi{
    private int not;

    public static int ogrenciSayisi=0;

    public Ogrenci(String ad, String soyad,int not) {
        super(ad, soyad);
        setNot(not);
        ogrenciSayisi++;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        if(not>0&&not<=100){
            this.not=not;
        }else{
            this.not=0;
            System.out.println("Hatalı not 0-100 arasında olmalı not 0 atandı");
        }
    }
    public void bilgileriGoster(){
        System.out.println("Ogrenci ad :"+getAd()+" Soyad :"+getSoyad()+" notu :"+getNot());
    }
    public static void okulİsmiYazdir(){
        System.out.println("YazilimAkademisi");
    }
}
class Ogretmen extends Kisi{
    private String brans;

    public Ogretmen(String ad, String soyad,String brans) {
        super(ad, soyad);
        this.brans=brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
    
    public void bilgileriGoster(){
        System.out.println("Öğretmen ad :"+getAd()+" Soyad :"+getSoyad()+" Brans : "+getBrans());
    }

}

public class FinalOdev {
    public static void main(String[] args) {
        ArrayList<Ogrenci> kisiler=new ArrayList<>();
        kisiler.add(new Ogrenci("Süleyman", "Yumusak", 30));
        kisiler.add(new Ogrenci("Süman", "Yumusak", 50));
        kisiler.add(new Ogrenci("Sülman", "Yumusak", 60));
        kisiler.add(new Ogrenci("Süman", "Yumusak", 70));
        kisiler.add(new Ogrenci("Sümn", "Yumusak", 80));
        
        kisiler.stream().filter(o->o.getNot()>60).map(o->o.getAd().toUpperCase()).forEach(System.out::println);
    }
    
}
