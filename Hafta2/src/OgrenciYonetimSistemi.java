import java.util.Scanner;

class Ogrenci{
    // 2.hafta ödevi gelişmiş öğrenci yönetim sistemi
    String ad;
    String soyad;
    int not;
    public Ogrenci(String ad,String soyad,int not){
        this.ad=ad;
        this.soyad=soyad;
        this.not=not;
    }
    public void bilgileriGoster(){
        System.out.println("İsim: " + ad + ", Soyisim: " + soyad + ", Not: " + not);
    }
}

public class OgrenciYonetimSistemi {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler=new Ogrenci[3];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<ogrenciler.length;i++){
            System.out.print("İsim:");
            String ad=scanner.nextLine();
            System.out.print("Soyisim:");
            String soyad=scanner.nextLine();
            System.out.print("not:");
            int not=scanner.nextInt();
            scanner.nextLine();
            ogrenciler[i]=new Ogrenci(ad, soyad, not);
        }
        if(ogrenciler.length==0){
            System.out.println("Hiç öğrenci girilmedi");
        }else{
            for (Ogrenci ogrenci : ogrenciler) {
                if(ogrenci.not>50){
                    System.out.print("Geçtiniz. ");
                    ogrenci.bilgileriGoster();
                    
                }else{
                    System.out.print("Kaldınız. ");
                    ogrenci.bilgileriGoster();
                    
                }
            }
        }
        
    }
    
}
