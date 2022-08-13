package day04_dataCasting;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {
        // Data Casting (Veri Sınfı Degiştirme)
        // Veri tipini değiştirmek kısacası

        char harf='a'; // Tek tırnağın içinde sadece bir tane harf veya rakam olur.
        // Char olması için tek tırnak olması gerek. char'a rakam da yapabiliriz. char=97 çıktısı "a" olur
        char yeniHarf=(char)(harf+1); // Kod her zaman esittirin(=) sağ tarafını yapar.  çıktısı "b" dir.

        System.out.println(yeniHarf);

        int sayi1=(int)7.9;
        System.out.println("sayi1: "+sayi1);//7

        double sayi2=10;
        System.out.println("sayi2: "+sayi2);//10.0

        int sayi3='c';
        System.out.println("sayi3: "+sayi3);//99

        char harf2=98;
        System.out.println("harf2: "+harf2);//b



    }
}
