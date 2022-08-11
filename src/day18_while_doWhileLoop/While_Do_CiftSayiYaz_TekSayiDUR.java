package day18_while_doWhileLoop;

import java.util.Scanner;

public class While_Do_CiftSayiYaz_TekSayiDUR {
    /*
    Kullanicidan tam sayilar Alin...
    Cift sayi girdikce devam et
    Tek sayi girince bitir
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        while (sayi%2==0) {

            System.out.println("Lutfen sayi girin : ");
            sayi=scan.nextInt();
        }
        System.out.println("Program Kapatiliyor...");

//------------------------------------------------------------------------------------------


     sayi=0;
     do {
         System.out.println("Do While ile Sayi girin : ");
         sayi=scan.nextInt();
         System.out.println(sayi);
     }while (sayi%2==0);
        System.out.println("Program Kapatiliyor(Do while).....");
    }


}
