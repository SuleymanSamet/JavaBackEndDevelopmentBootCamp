
class Cuzdan{
    private double nakit;
    public Cuzdan(){
        this.nakit=50;
    }
    public void harcamaYap(double miktar){
        if(miktar>nakit){
            System.out.println("Bakiye yetersiz işlem yapılamadı");
        }else{
            nakit-=miktar;
            System.out.println("Bakiyenizden "+miktar+" tutarında para çekilmiştir kalan bakiye :"+nakit);
        }
    }
}
public class Gider {
    public static void main(String[] args) {
        Cuzdan cuzdan=new Cuzdan();
        cuzdan.harcamaYap(30);
    }
    
}
