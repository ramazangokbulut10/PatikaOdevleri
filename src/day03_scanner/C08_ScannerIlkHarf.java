package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Adınızı girin");

        char ilkHarf=scan.next().toUpperCase().charAt(0);/*Klavyeden girilen ilkHarf variablenin ilk harfini
                                                         büyük olarak yazdırma
                                                         */
        // Char'ın 0.indexi "R" ye esittir, toUpperCase büyük yazdırmak için kullanılır.
        // Javada nextchar yoktur bunun yerine String olarak ilk kelimeyi next() olarak yazdırırız.
        // Non primitive data türlerinin sonuna "." koydugumuzda birden fazla method çıkar.


        System.out.println("İsmin İlk Harfi: "+ilkHarf);



    }
}
