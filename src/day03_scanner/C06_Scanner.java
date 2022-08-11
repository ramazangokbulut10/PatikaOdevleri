package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanıcıdan ismini soismini ve yasını alip girilen
        bilgiler=seyfi capar 34 seklinde yazdıran
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Adınızı giriniz.");
        String isim=scan.nextLine();
        System.out.println("Soyadınızı giriniz.");
        String soyad=scan.nextLine();
        System.out.println("Yaşınızı giriniz.");
        double yas=scan.nextDouble();

        System.out.println("Girilen bilgiler= "+isim+" "+soyad+" "+yas);

    }
}
