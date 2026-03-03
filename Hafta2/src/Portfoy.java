import java.util.ArrayList;

class Hisse {
    String name;
    int lot;
    double maliyet;
    double guncelFiyat;

    public Hisse(String name,int lot,double maliyet,double guncelFiyat){
        this.name=name;
        this.lot=lot;
        this.maliyet=maliyet;
        this.guncelFiyat=guncelFiyat;
    }
    public double toplamDeger(){
        return this.lot*this.maliyet;
    }
    public double karZararHesapla(){
        return (guncelFiyat-maliyet)*lot;
    }  
}
public class Portfoy {
    public static void main(String[] args) {
        ArrayList<Hisse> portfoy=new ArrayList<>();
        portfoy.add(new Hisse("netcad", 20, 40, 100));
        portfoy.add(new Hisse("endae", 270, 14.72, 13));
        portfoy.add(new Hisse("frmpl", 14, 30, 29));
        portfoy.add(new Hisse("meysu", 78, 7.60, 12));
        portfoy.add(new Hisse("ucay", 30, 32, 34));

        double genelToplam=0;
        for(Hisse h:portfoy){
            double deger=h.toplamDeger();
            genelToplam+=deger;
            System.out.println("Hisse: "+h.name+" lot: "+h.lot+" maliyet : "+h.maliyet);
            if(h.guncelFiyat>h.maliyet){
                System.out.println("Kar : "+h.karZararHesapla());
            }else{
                System.out.println("Zarar : "+h.karZararHesapla());
            }
        }
        System.out.println("Toplam deger: "+genelToplam);
    }

}
