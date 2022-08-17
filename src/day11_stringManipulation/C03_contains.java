package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        /*

         "contains" methodu bir String'deki karakterleri içerip içermediğini kontrol eder, varsa "true" yoksa "false" yapar.

          Soru 1) Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
          @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen e mail yazınız");
        
        String email=scan.nextLine();
        if(!email.contains("@gmail"))  // Başına ünlem koyduk çünkü içermesin istiyoruz.
        {
            System.out.println("Lütfen gmail adresini girin");
            
        } else if (email.lastIndexOf("@gmail")==(email.length()-10)) // length-10 yazma sebebimiz "gmail.com" m harfi -1 idi saymaya  başladık -10 oldu.
        {
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("Lutfen yazımı kontrol edin");
        }
    }
}
