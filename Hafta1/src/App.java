import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //.hafta ödevi öğrenci not sistemi
        //bir sınıftaki 5 öğrencinin notlarını tutan ve o notların ortalamasını, max ve min bulan kod

        Scanner scanner = new Scanner(System.in);
        int[] notlar = new int[5];

        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i + 1) + ". Notu giriniz : ");
            notlar[i] = scanner.nextInt();
        }

        System.out.println("Ortalama: " + hesaplaOrtalama(notlar));
        System.out.println("Max: " + enBuyukBul(notlar));
        System.out.println("Min: " + enKucukBul(notlar));
    }

    publicpublic App() {
    }
 static double hesaplaOrtalama(int[] dizi) {
        int toplam = 0;
        for (int sayi : dizi) {
            toplam += sayi;
        }
        return (double) toplam / dizi.length; // ortalama için bölme eklendi
    }

    public static int enBuyukBul(int[] dizi) {
        int max = dizi[0];
        for (int sayi : dizi) {
            if (max < sayi) {
                max = sayi;
            }
        }
        return max;
    }

    public static int enKucukBul(int[] dizi) {
        int min = dizi[0];
        for (int sayi : dizi) {
            if (min > sayi) {
                min = sayi;
            }
        }
        return min;
    }
}
