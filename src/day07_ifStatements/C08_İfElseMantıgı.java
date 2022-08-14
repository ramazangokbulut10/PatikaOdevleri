package day07_ifStatements;

import java.util.Scanner;

public class C08_İfElseMantıgı {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yaşını alınız, 65'ten büyük ve eşit ise emekli olabilsin, küçük ise olamasın.
        Aynı zamanda kullanıcı yaşını 0 ve 0'dan küçük değer girdiğinde, lütfen gecerli yaş giriniz yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin:");
        int yas=scan.nextInt();
        if (yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz.");
        }
        if (yas<65)
        {
            System.out.println("Emekli Olamazsın "+(65-yas)+" yıl daha çalışmalısın");

        }else {
            System.out.println("Emekli Olursun:");
        }

        /*  Kullanıcı -10 girdiginde, çalıştırdığımızda çıktı şu şekilde olacak

        Lutfen gecerli bir yas giriniz.
        Emekli olamazsın 75 yıl daha çalışmalısın.

        Sebebi if bodyleri birbirinden bagımsızdır demiştik, girilen sayıya göre en üstteki "if ayrı çalışıyor", "ortadaki if ayrı çalışıyor".

        iki durum varsa if else kullanırız aşağıdaki gibi
        65 yaşından büyükse emekli olsun değilse emekli olmasın
         */

        /*
        3 ve 3'ten fazla şart varsa,
        if
        else if (gerektiği kadar kullanırsın)
        else (ile btiririz.)
         */




    }
}
