package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        // Modulus % bize kalanı verir.    10%3  1 olur.

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı Pozitif bir Tamsayı girin:");

        // Bir sayının birler basamağındaki sayıyı yakalamak veyahut bulmak için o sayıyı " sayi % 10'a böleriz."
        // Bir sayının birler basamağından kurtulmak için o sayıyı " 10'a böleriz.  sayi/10"
        // Biz bu islemi sıfır olana  kadar tekrarlarız.

        int sayi=scan.nextInt();
        int birlerBasamagi=0,toplam=0;

        birlerBasamagi=sayi%10;
        toplam+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        toplam+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        toplam+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        toplam+=birlerBasamagi;
        sayi/=10;

       System.out.println(toplam);

       // Mesala biz burda 4 basamaklı sayı için yaptık tekrarladık. 5 basamaklı sayı girersek aşağıdaki gibi olur.
       // 14532   2+3+5+4= 14 olur.   10 binler basamağı yani "1" sayısını işleme katmaz.

    }
}
