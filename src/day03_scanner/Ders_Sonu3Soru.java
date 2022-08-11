package day03_scanner;

import java.util.Scanner;

public class Ders_Sonu3Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çemberin yarıçapını girin:");
        double yaricap=scan.nextDouble();

        System.out.println("Çemberin Çevresi:"+(2*yaricap));

    }

}
