package day03_scanner;

import java.util.Scanner;

public class Ders_Sonu1Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Sayı girin:");
        int sayi1=scan.nextInt();

        System.out.println("2.Sayı girin:");
        int sayi2=scan.nextInt();

        System.out.println("Sayıların toplamı:"+(sayi1+sayi2));
        System.out.println("Sayıların Farkı:"+(sayi1-sayi2));
        System.out.println("Sayıların çarpımı:"+(sayi1*sayi2));

    }
}
