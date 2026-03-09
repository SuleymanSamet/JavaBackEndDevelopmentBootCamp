package com.jd.ders25;

import java.util.UUID;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private boolean isActive;

    public Account(String ownerName){
        this.accountNumber=UUID.randomUUID().toString();
        if(ownerName==null){
            System.out.println("Hesap sahip adı null olamaz");
        }else if(ownerName.length()<3){
            System.out.println("Hesap sahip adı 3 karakterden az olamaz");
        }else{
            this.ownerName=ownerName;
        }
        this.balance=0.00;
        this.isActive=true;

        
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public boolean isActive(){
        return isActive;
    }
    public void setIsActive(boolean isActive){
        this.isActive=isActive;

    }



    @Override
    public String toString() {
        return "Account [accountNumber=" + getAccountNumber() + ", ownerName=" + getOwnerName() + ", balance=" + getBalance()
                + ", isActive=" + isActive() + "]";
    }
}
