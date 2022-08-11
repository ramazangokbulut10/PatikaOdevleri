package practice01.day08;

import java.util.Scanner;

public class soru3_dowhileLoop {
    /*
Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
ve x girildiğinde ise "Program bitti" yazan programı yazınız.
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String harf="";
        do {
            System.out.println("Harf Girin");
            harf=scan.next();
            System.out.println("Program çalışıyor");

        }while (!harf.equalsIgnoreCase("x"));
        System.out.println("Program bitti...");

    }
}
