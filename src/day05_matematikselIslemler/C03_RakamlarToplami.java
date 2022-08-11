package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı Pozitif bir Tamsayı girin:");

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


    }
}
