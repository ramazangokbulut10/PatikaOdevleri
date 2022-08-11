package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Gün İsmi Gİriniz");

        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazar")||girilenGun.equals("cumartesi"))
        {
            System.out.println("Hafta sonu");

        }
        if (girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("çarşamba")||girilenGun.equals("perşembe")||girilenGun.equals("cuma"))

        {
            System.out.println("Hafta içi");
        }

        if (!(girilenGun.equals("pazartesi")||girilenGun.equals("salı")||girilenGun.equals("çarşamba")||girilenGun.equals("perşembe")||girilenGun.equals("cuma")||girilenGun.equals("pazar")||girilenGun.equals("cumartesi")))

        {
            System.out.println("Düzgün GİR");
        }

    }
}
