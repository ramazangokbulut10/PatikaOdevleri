package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // Soru3 ) Kullanicidan bir sayi alin ve sayinin MUTLAK DEĞERİNİ yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();                       //    ŞART    ?Doğru :  Yanlış
        System.out.println("Girdiginiz sayinin mutlak degeri : "+ (sayi>=0 ? sayi : (-1 * sayi)));
                                                           //   Şart  ?doğruysa: Yanlışsa burası çalışır
                                                              //          burası çalışır

    //Bir sayının teklik çiftliğini kontrol et

        System.out.println("Tek-Çift olduğunu kontrol edecek sayıyı gir: ");
        double sayi2=scan.nextDouble();

        System.out.println("SAYININ ÇİFTLİK TESTLİK SONUCU: "+(sayi2%2==0?"Sayi çifttir":"Sayi TEKTİR."));

    }
}