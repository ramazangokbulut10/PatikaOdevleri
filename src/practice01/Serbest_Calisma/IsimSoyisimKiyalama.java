package practice01.Serbest_Calisma;

import java.util.Scanner;

public class IsimSoyisimKiyalama {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
        // yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi girin : ");
        String name=scan.nextLine();
        System.out.println("Soyadınızı girin : ");
        String lastName=scan.nextLine();

        if(lastName.length()>name.length())
        {
            System.out.println("Soyadınız daha uzun");
        }else {
            System.out.println("İsminiz daha Uzun");
        }

        String output=lastName.length()>name.length()?"SOYADINIZ DAHA UZUN":"ADINIZ DAHA UZUN";
        System.out.println(output);




    }
}
