
class Ogrenci{
    private String ad;
    private String soyad;
    private int not;
    public static int ogrenciSayisi=0;
    public Ogrenci(String ad,String soyad,int not){
        this.ad=ad;
        this.soyad=soyad;
        setNot(not);
        ogrenciSayisi++;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int getNot() {
        return not;
    }
    public void setNot(int not) {
        if(not>=0&&not<=100){
            this.not = not;
        }else{
            System.out.println("Hata:not 0-100 arasında olmalıdır değer : 0 atandı");
            this.not=0;
        }    
    }
    public static void okulIsmiYazdır(){
        System.out.println("Yazılım Akademisi");
    }
    
    public void bilgileriGoster() {
         System.out.println("Ogrenci [getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getNot()=" + getNot() + "]");
    }        
}
public class App {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Süleyman", "Yumuşak", 35);
        Ogrenci ogr2=new Ogrenci("Ahmet", "Yılmaz", 85);
        ogr1.bilgileriGoster();
        ogr1.setAd("Fatih");
        ogr1.bilgileriGoster();
        ogr2.bilgileriGoster();
        System.out.println("Toplam öğrenci sayisi:"+Ogrenci.ogrenciSayisi);
        Ogrenci.okulIsmiYazdır();
        
    }
    
}
