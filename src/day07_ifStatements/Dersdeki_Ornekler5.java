package day07_ifStatements;

import java.util.Scanner;

public class Dersdeki_Ornekler5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Geçerli Bir Gün İsmi Girin");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazartesi")||(girilenGun.equals("salı"))||(girilenGun.equals("çarşamba"))||(girilenGun.equals("perşembe"))||(girilenGun.equals("cuma"))||(girilenGun.equals("cumartesi"))||(girilenGun.equals("pazar")))
        {
            System.out.println(""+girilenGun.toUpperCase().charAt(0)+girilenGun.toLowerCase().charAt(1)+girilenGun.toLowerCase().charAt(2));
        }
        else
        {System.out.println("Lütfen Geçerli Bir Gün Girin!!!");

        }

    }
}
