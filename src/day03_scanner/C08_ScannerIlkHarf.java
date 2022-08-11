package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Adınızı girin");

        char ilkHarf=scan.next().toUpperCase().charAt(0);/*Kalvyeden girilen ilkHarf variablenin ilk harfini
                                                         büyük olarak yazdırma

                                                         */


        System.out.println("İsmin İlk Harfi: "+ilkHarf);



    }
}
