package com.jd.ders24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        Scanner scanner=new Scanner(System.in);
        //product.name="Çikolata"; private ulaşamıyoruz
        //product.setName("çikolata");//set değiştirmek atamak
        //System.out.println(product.getName());//get getirmek

        System.out.print("Ürün adını giriniz:");
        String productName=scanner.nextLine();
        product.setName(productName);
        product.setCode("1122");
        product.setPrice(10.33);
        product.increasePriceAmount(7.99);
        System.out.println(product.getPrice());


    }

}
