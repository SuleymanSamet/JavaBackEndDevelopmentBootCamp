package com.jd.ders23;



public class Student {
    String name;
    String surname;
    String id;
    String department;
    String gender;
    String birthDate;
    double average;
    int grade;
    String birthPlace;
    
    @Override public String toString() { 
        return "Ad: " + name + ", Soyad: " + surname + ", TC: " + id + ", Bölüm: " + department + ", Cinsiyet: " + gender + ", Doğum Tarihi: " + birthDate + ", Not: " + grade + ", Doğum Yeri: " + birthPlace; 
    }





}
