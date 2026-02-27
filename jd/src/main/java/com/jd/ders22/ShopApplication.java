package com.jd.ders22;

import java.util.Scanner;

public class ShopApplication {
    public static final int productSize=5;
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        

        Product[] products=getProducts();

        int[] units=getUnitSize(products);

        double totalPrice=0;
        for(int i=0;i<productSize;i++){
            totalPrice+=(products[i].unitPrice*units[i]);
        }
        System.out.println("Toplam tutar:"+totalPrice+" TL");

    }
    public static Product[] getProducts(){
        Product[] products=new Product[productSize];

        products[0]=new Product();
        products[0].name="Çikolata";
        products[0].unitPrice=12.60;

        products[1]=new Product();
        products[1].name="Kola";
        products[1].unitPrice=40.0;

        products[2]=new Product();
        products[2].name="Cips";
        products[2].unitPrice=33.0;

        products[3]=new Product();
        products[3].name="Dondurma";
        products[3].unitPrice=20.0;

        products[4]=new Product();
        products[4].name="Bulgur(1kg)";
        products[4].unitPrice=10.0;

        return products;
    }
    
    
    public static int[] getUnitSize(Product[] products){
    Scanner scanner = new Scanner(System.in);
    int[] units = new int[products.length];
    for(int i=0; i<productSize; i++){
        System.out.print(products[i].name + " Kaç adet : ");
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
