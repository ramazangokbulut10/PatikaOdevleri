package practice01.day04;

import java.util.Scanner;

public class Serbest_Calisma {
    public static void main(String[] args) {
        /* kullanıcıdan bir sifre girmesini isteyin. Asagıdaki sartlari
       saglıyorsa "sifre basari ile tanimlandi."
        yazdirin. Saglamazsa "islem basarisiz, lutfen yeni bir sifre girin." yazdırın.
        -ilk harf büyük
        -son harf küçük
        -sifre bosluk içermemeli
        -sifre uzunlugu en az 8 karakter
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Şifre giriniz : ");
        String sifre= scan.nextLine();
        //System.out.println(sifre.substring(0,1));
        if(sifre.length()!=8)
        {
            System.out.println("Şifre 8 haneli olmalı");
        }else {
        if (sifre.charAt(0)<='A'||sifre.charAt(0)>='Z'){

            System.out.println("İlk harf büyük olmalı");
        }
        if (!(sifre.charAt(7)>='a')||!(sifre.charAt(7)<='z')){
            System.out.println("son harf küçük olmalı");
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
        }


        }
}
}
