package PatikaDev;

import java.util.Scanner;

public class  day04NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        // NotOrtalamasıHesaplayan program yazınız.

        double matematik,fizik,turkce,tarih;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz.");
        matematik=scan.nextDouble();
        System.out.println("Fizik notunuzu giriniz.");
        fizik=scan.nextDouble();
        System.out.println("Turkce notunuzu giriniz.");
        turkce=scan.nextDouble();
        System.out.println("Tarih notunuzu giriniz.");
        tarih=scan.nextDouble();
        double ortalama=(matematik+fizik+turkce+tarih)/4;
        System.out.println("ortalama = " + ortalama);
        if (ortalama>60){
            System.out.println("Sınıfı geçtiniz,tebrikler:)");
        } else  {
            System.out.println("üzgünüm sınıfta kaldınız.");
        }

    }
}
