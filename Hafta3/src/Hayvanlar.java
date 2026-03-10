class Hayvan{
    public void sesCikar(){
        System.out.println("Hayvan ses Çıkarıyor");
    }
}
class Kedi extends Hayvan{
    @Override
    public void sesCikar(){
        System.out.println("miav");
    }
}
public class Hayvanlar {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.sesCikar();
    }

}
