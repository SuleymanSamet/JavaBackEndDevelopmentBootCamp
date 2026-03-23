package com.jd.ders25;

import java.util.UUID;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private boolean isActive;

    private final static int OWNER_NAME_MIN_LENGTH=3;

    public Account(String ownerName){
        this.accountNumber=UUID.randomUUID().toString();
        setOwnerName(ownerName);
        this.balance=0.00;
        this.isActive=true;  
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        if(ownerName==null){
            System.out.println("Hesap sahip adı null olamaz");
        }else if(ownerName.length()<OWNER_NAME_MIN_LENGTH){
            System.out.println("Hesap sahip adı 3 karakterden az olamaz");
        }else{
            this.ownerName=ownerName;
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void depositByAmount(double amount){
        if(isActive==false){
            System.out.println("Hesap kapalı");
        }else if(amount<0){
            System.out.println("Miktar pozitif olmalı");
        }else{
            this.balance+=amount;
            System.out.println(amount+" tl yatırıldı toplam bakiye : "+this.balance);
        }
    }
    public void withDrowByAmount(double amount){
        if(isActive==false){
            System.out.println("Hesap kapalı");
        }else if(amount<0){
            System.out.println("Miktar pozitif olmalı");
        }else if(amount>this.balance){
            System.out.println("Yetersiz bakiye");
        }else{
            this.balance-=amount;
            System.out.println(amount+" TL çekildi güncel bakiye : "+this.balance);
        }

    }

    public boolean isActive(){
        return isActive;
    }
    
    public void closeAccount(){
        this.isActive=false;
        System.out.println("Hesap kapatılmıştır");
    }



    @Override
    public String toString() {
        return "Account [accountNumber=" + getAccountNumber() + ", ownerName=" + getOwnerName() + ", balance=" + getBalance()
                + ", isActive=" + isActive() + "]";
    }
}
