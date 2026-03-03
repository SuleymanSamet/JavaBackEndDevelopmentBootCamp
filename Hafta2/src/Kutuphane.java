class Kitap{
    String isim;
    String yazar;
    int sayfaSayisi;

    public Kitap(String isim,String yazar){
        this.isim=isim;
        this.yazar=yazar;
    }
    public Kitap(String isim,String yazar,int sayfaSayisi){
        this.isim=isim;
        this.yazar=yazar;
        this.sayfaSayisi=sayfaSayisi;
    }
    @Override
    public String toString() {
        return "Kitap: " + isim + ", Yazar: " + yazar + ", Sayfa Sayısı: " + sayfaSayisi;
    }


}
public class Kutuphane {
    public static void main(String[] args) {
        Kitap kitap1=new Kitap("Suç ve Ceza", "Fyodor Dostoyevski", 671);
        Kitap kitap2=new Kitap("Sefiller", "Victor Hugo");
        System.out.println(kitap1);
        System.out.println(kitap2);
        
    }
}
