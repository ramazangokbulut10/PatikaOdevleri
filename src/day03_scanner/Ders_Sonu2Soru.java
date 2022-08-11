package day03_scanner;

import java.util.Scanner;

public class Ders_Sonu2Soru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin bir kenarını girin:");
        int karekenar=scan.nextInt();

        System.out.println("Karenin Alanı:"+(karekenar*karekenar));

    }
}
