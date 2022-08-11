package day03_scanner;

import java.util.Scanner;

public class Ders_Sonu7Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        char isim=scan.next().toUpperCase().charAt(0);

        System.out.println("İsminizin Baş Harfi: "+isim);

    }
}
