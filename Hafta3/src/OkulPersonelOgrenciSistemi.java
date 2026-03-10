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
    public void bilgileriGöster(){
        System.out.println("Çalışan ad:"+getAd()+" soyad:"+getSoyad());
    }
}
class Ogrenci extends Kisi{
    private int not;
    public static int ogrenciSayisi=0;
    public Ogrenci(String ad,String soyad,int not){
        super(ad, soyad);
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
    public void bilgileriGoster(){
        System.out.println("Öğrenci : ad:"+getAd()+" Soyad :"+getSoyad()+"notu :"+getNot());
    }
}
class Ogretmen extends Kisi{
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
            System.out.println("Öğretmen : ad:"+getAd()+"Soyad : "+getSoyad()+" Branş:"+getBrans());
        }
    }
}
public class OkulPersonelOgrenciSistemi {
    public static void main(String[] args) {
        Kisi hademe=new Kisi("Mehmet", "Uzun");
        Ogrenci ogrenci=new Ogrenci("Süleyman", "Yumusak", 30);
        Ogretmen ogretmen=new Ogretmen("Engin", "Kısa", "Yazılım");
        ArrayList<Kisi> arrayList=new ArrayList<>();
        arrayList.add(ogretmen);
        arrayList.add(ogrenci);
        arrayList.add(hademe);

        for(Kisi kisi:arrayList){
            kisi.bilgileriGöster();
        }
    }
    
}
