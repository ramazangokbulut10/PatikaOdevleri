package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerilenSayidanFibonacciHesapla {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        List<Integer> liste=new ArrayList<Integer>();
        int a=1;
        int b=1;
        int c=0;

        liste.add(c);
       liste.add(a);
       liste.add(b);
        for (int i = 0; i < sayi; i++) {
            c=a+b;
            liste.add(c);
            a=b;
            b=c;
        }
        System.out.println(liste);
    }
}
