package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /* kullanıcıdan alınan iki sayıyı çarpma */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı girin");
        double sayi1=scan.nextDouble();

        //İkinci sayi için:

        System.out.println("Lütfen ikinci sayıyı girin");
        double sayi2=scan.nextDouble();

        System.out.println("Girilen sayıların çarpımı "+(sayi1*sayi2));


    }
}
