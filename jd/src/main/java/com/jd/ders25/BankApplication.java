package com.jd.ders25;

public class BankApplication {
    public static void main(String[] args) {
        Account samet=new Account("Süleyman");
        System.out.println(samet);
        samet.depositByAmount(10);
        System.out.println(samet);
        samet.depositByAmount(1000);
        System.out.println(samet);
        samet.withDrowByAmount(15);
        System.out.println(samet);
        samet.closeAccount();
        System.out.println(samet);
        samet.withDrowByAmount(5000);
        
    }

}
