package day09_ternary;

import java.util.Scanner;

public class Serbest_Calisma_NestedTernary {
    public static void main(String[] args) {
        // Soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Harf Girin:");
        char harf=scan.next().charAt(0);

        String sonuc=harf>='A'&&harf<='Z'?"Girilen Harf Büyüktür": harf>='a' && harf<='z'?"Girilen Harf Küçüktür":"Girdiğiniz karakter harf değil";
        System.out.println(harf+"\n"+sonuc);



    }
}
