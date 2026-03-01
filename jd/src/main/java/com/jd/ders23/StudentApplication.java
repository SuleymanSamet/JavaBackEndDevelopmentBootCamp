package com.jd.ders23;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students=new Student[3];
        for(int i=0;i<students.length;i++){
            System.out.println((i+1)+". Öğrenci Bilgilerini giriniz :");
            students[i]=new Student();
            System.out.print("Öğrenci Adını giriniz :");
            students[i].name=scanner.nextLine();
            System.out.print("Öğrenci Soyadını giriniz :");
            students[i].surname=scanner.nextLine();
            System.out.print("Öğrenci TC giriniz :");
            students[i].id=scanner.nextLine();
            System.out.print("Öğrenci Bölümünü giriniz :");
            students[i].department=scanner.nextLine();
            System.out.print("Öğrenci Cinsiyet giriniz :");
            students[i].gender=scanner.nextLine();
            System.out.print("Öğrenci Doğum Tarihi giriniz :");
            students[i].birthDate=scanner.nextLine();
            System.out.print("Öğrenci Notu giriniz :");
            students[i].grade=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Öğrenci Doğum yeri giriniz :");
            students[i].birthPlace=scanner.nextLine();
        }
        System.out.println("Filtrelemek istediğiniz harfi giriniz:");
        String studentChar=scanner.nextLine();
        for(int i=0;i<students.length;i++){
            if(students[i].name.startsWith(studentChar)){
                //students[i].name.toLowerCase().startsWith(studentChar.toLowerCase())
                //if icine buyuk ucuk harf duyarlılı olmasın dersek .lowercase eklemeliyiz
                System.out.println(students[i]);
            }
        }
    }

}
