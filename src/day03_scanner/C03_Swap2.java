package day03_scanner;

import java.util.Scanner;

public class C03_Swap2 {

    public static void main(String[] args) {
   int sayi1=10,sayi2=20;

        System.out.println("Swaptan önce sayi1:"+sayi1);
        System.out.println("Swaptan önce sayi2:"+sayi2);
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swaptan sonra sayi1:"+sayi1);
        System.out.println("Swaptan sonra sayi2:"+sayi2);

    }
}
