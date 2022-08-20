package day15_overloading_forloop;

import java.util.Scanner;

public class C00_returnDeneme {
    public static void main(String[] args) {

        int sonuc=bolGetir();
        System.out.println(sonuc);





    }

    private static int bolGetir() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayıyı giriniz");
        int birinciSayı=scan.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz");
        int ikinciSayı=scan.nextInt();
        int bolunenSayi=birinciSayı/ikinciSayı;
        return bolunenSayi;
    }
}
