package com.jd.ders21;

import java.util.Scanner;

public class Market {
    public static final int productSize=5;
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        

        String[] productNames=getProductName();
        //double[] prices =new Market().getPriceUnit();//static olmadıgı ıcın boyle yapıldı
        double[] prices =getPriceUnit();
        int[] units=getUnitSize(productNames);

        double totalPrice=0;
        for(int i=0;i<productSize;i++){
            totalPrice+=(prices[i]*units[i]);
        }
        System.out.println("Toplam tutar:"+totalPrice+" TL");

    }
    public static String[] getProductName(){
        String[] productNames=new String[productSize];
        
        productNames[0]="Çikolata";
        productNames[1]="Kola";
        productNames[2]="Cips";
        productNames[3]="Dondurma";
        productNames[4]="Bulgur kg";
        return productNames;
        
    }
    public static double[] getPriceUnit(){
        double[] prices =new double[productSize];
        prices[0]=12.60;
        prices[1]=40.00;
        prices[2]=33.00;
        prices[3]=20.00;
        prices[4]=10.00;
        return prices;

    }
    
    public static int[] getUnitSize(String[] productNames){
    Scanner scanner = new Scanner(System.in);
    int[] units = new int[productSize];
    for(int i=0; i<productSize; i++){
        System.out.print(productNames[i] + " Kaç adet : ");
        int tmp = scanner.nextInt();
        if(tmp < 0){
            System.out.println("Eksi değer girilemez...");
            continue;
        }
        units[i] = tmp;
    }
    return units;
}


}
    