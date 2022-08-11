package practice01.day05;

import java.util.Scanner;

public class Q055_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve
// hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi girin : ");
        String isim=scan.next();
        System.out.println("Soyisim");
        String soyisim=scan.next();

        if(isim.length()>soyisim.length()){
            System.out.println("İsminiz soyisminizden uzundur.");
        } else if (isim.length()==soyisim.length()){
            System.out.println("İsminiz soyisminizden eşit uzunlukta");
        }else{
            System.out.println("Soyisminiz isminizden daha uzundur.");
        }
        {

        }
    }
}
