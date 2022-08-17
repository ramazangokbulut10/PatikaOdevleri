package day11_stringManipulation;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
        /*
               Soru 1) Kullanicidan email adresini girmesini isteyin,
               mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
               @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
               @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen e mail yazınız");

        String email=scan.nextLine();
        if(!email.endsWith("@gmail.com"))
        {
            System.out.println("E-posta doğru adresini girin");
        }
        else if(email.endsWith("@gmail.com"))
        {
            System.out.println("Kayıt yapıldı");
        } else {
            System.out.println("Giriş hatalı");
        }
    }
}
