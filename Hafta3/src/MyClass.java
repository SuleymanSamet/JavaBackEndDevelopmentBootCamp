class Hisse{
    String ad;
    double maliyet;
    public Hisse(String ad,double maliyet) {
        this.ad=ad;
        this.maliyet=maliyet;
    }
    public void analizEt(){
        System.out.println(ad+" için halka arz analizi yapılıyor..");

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
        System.out.println(ad+" Halka arz analizi yapılıyor... Tavan sayısı:"+tavanSayisi);
    }
    public void tavanSerisiYazdir(){
        System.out.println(ad+" hissesi "+tavanSayisi+" gündür tavan bozmadı");
    }


}
public class MyClass {
    public static void main(String[] args) {
        Hisse hisse = new Hisse("Netcad", 40);
        HalkaArz halkaArz=new HalkaArz("Meysu", 7, 3);
        hisse.analizEt();
        halkaArz.analizEt();
        halkaArz.tavanSerisiYazdir();
    }

}
