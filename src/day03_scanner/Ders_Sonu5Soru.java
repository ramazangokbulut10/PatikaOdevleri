package day03_scanner;

import java.util.Scanner;

public class Ders_Sonu5Soru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi girin:");
        String isim=scan.nextLine();

        System.out.println("Soyadınızı girin:");
        String soyad=scan.nextLine();

        System.out.println("İsminiz: "+isim);
        System.out.println("Soyadınız: "+ soyad);
        System.out.println("Kursumuza katılımınız alınmıştır,teşekkur ederiz.");
    }
}
