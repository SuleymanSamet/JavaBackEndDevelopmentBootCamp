package com.jd.ders24;

public class Product {
    //Encapsulation
    //public String name; //default public 
    private String name;
    private String code;
    private double price;


    public String getName() {
        return name;
    }
    

    public void setName(String name) {
         if(name==null){
            System.out.println("Ürün adı null olamaz");
        }else if(name.isEmpty()){
            System.out.println("Ürün adı boş olamaz");
        }else if(name.length()<3){
            System.out.println("Ürün Adı 3 karakterden az olamaz");
        }else{
            this.name=name;
            System.out.println(name);
        }

    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if(price<0){
            System.out.println("Ürün fiyatı negatif olamaz");
        }else{
            this.price = price;
        }
    }
    public void increasePriceAmount(double amounth){
        if(amounth<0){
            System.out.println("Miktar negatif olamaz");
        }else{
            this.price+=amounth;
        }

    }
    




}
