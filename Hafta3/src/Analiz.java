import java.util.ArrayList;

class Hisse extends Varlik{
    String ad;
    double maliyet;
    public Hisse(String ad,double maliyet){
        this.ad=ad;
        this.maliyet=maliyet;
    }
    public void analizEt(){
        System.out.println(ad+" için standart analiz yapılıyor..");

    }
    void fiyatHesapla(){
        System.out.println(ad+" fiyatı:"+maliyet);
    }
}
class HalkaArz extends Hisse{
    int tavanSayisi;
    public HalkaArz(String ad,double maliyet,int tavanSayisi){
        super(ad, maliyet);
        this.tavanSayisi=tavanSayisi;
    }
    @Override
    public void analizEt(){
        System.out.println(ad+" için haka arz analizi yapılıyor... tavan sayisi:"+tavanSayisi);
    }
    public void tavanSerisiYazdir(){
        System.out.println(ad+" hissesi "+tavanSayisi+" gündür tavan bozmadı");
    }
    @Override
    void fiyatHesapla(){
        System.out.println(ad+" fiyatı: "+maliyet);
    } 
}
abstract class Varlik{
    abstract void fiyatHesapla();
}

public class Analiz {
    public static void main(String[] args) {
        ArrayList<Hisse> arrayList=new ArrayList<>();
        arrayList.add(new Hisse("Netcad", 40));
        arrayList.add(new HalkaArz("Meysu", 7, 3));

        for (Hisse object : arrayList) {
            object.analizEt();
        }
    }
    
}
