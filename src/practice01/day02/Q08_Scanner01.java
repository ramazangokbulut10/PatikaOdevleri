package practice01.day02;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1. sayı girin: ");

        int sayi1=scan.nextInt();
        System.out.print("2. sayı girin: ");
        int sayi2=scan.nextInt();
        System.out.println("Sayıların toplamı = "+ (sayi1+ sayi2));
    }
}
