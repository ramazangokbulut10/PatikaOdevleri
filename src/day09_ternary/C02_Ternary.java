package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Soru4)Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı girin: ");

        double sayi=scan.nextDouble();

        //Eğer Ternary içindeki sonuçlar farklı data türlerinde ise
        //ATAMA YAPAMAYIZ!!!! ,sadece yazdırabiliriz.

        System.out.println(sayi>0?"Sayi Pozitif":(sayi*sayi));


        System.out.println(sayi%2==0?"Sayı Çift":"Sayı Tek");






    }
}
