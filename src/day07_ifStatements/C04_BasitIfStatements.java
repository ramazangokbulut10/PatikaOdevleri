package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Gün İsmi Gİriniz");

        String girilenGun=scan.next().toLowerCase();
        // toLoweCase kullanıcının kücük büyük veya karışık girecegini bilmedigimiz icin, ne girerse girsin kücük harf dönecek bize

        if (girilenGun.equals("pazar")||girilenGun.equals("cumartesi")) // String icin "equals (==)" kullanırız aynı anlama gelir sadece String icin kullanırız.
        {
            System.out.println("Hafta sonu");

        }
        if (girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("çarşamba")||girilenGun.equals("perşembe")||girilenGun.equals("cuma"))

        {
            System.out.println("Hafta içi");
        }

        if (!(girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("çarşamba")||girilenGun.equals("perşembe")||girilenGun.equals("cuma")||girilenGun.equals("cumartesi")||girilenGun.equals("pazar")))
           // ! Parantezin önündeki ünlem işareti değildir anlamına gelir yani, bu günlerin dışında bir şey girince düzgün gir yazısı çıktı olarak gelecek.
        {
            System.out.println("Düzgün GİR");
        }

    }
}
