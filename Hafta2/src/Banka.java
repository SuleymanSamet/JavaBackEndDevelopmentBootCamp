
class BankaHesabi{
    String hesapSahibi;
    String cardNo;
    double bakiye;
    public BankaHesabi(String hesapSahibi,String cardNo,double bakiye){
        this.hesapSahibi=hesapSahibi;
        this.cardNo=cardNo;
        this.bakiye=bakiye;
    }
    public double paraYatir(double miktar){
        return bakiye+=miktar;
    }
    public void paraCek(double miktar){
        if(miktar>bakiye){
            System.out.println("Bakiye yetersiz. işlem gerçekleştirilemedi");
        }else{
            bakiye-=miktar;
            System.out.println("Hesabınızdan :"+miktar+" TL para çekildi");
        }
    }
    public void bakiyeSorgula(){
        System.out.println("Mevcut bakiye :"+bakiye);
    }
}
public class Banka {
    public static void main(String[] args) {
        BankaHesabi garanti=new BankaHesabi("Süleyman", "3468", 1000);
        garanti.paraYatir(1.5);
        garanti.paraCek(101.5);
        garanti.bakiyeSorgula();
    }

}
