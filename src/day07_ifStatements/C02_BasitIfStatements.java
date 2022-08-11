package day07_ifStatements;

import java.util.Scanner;

public class C02_BasitIfStatements {
    public static void main(String[] args) {

        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı girin: ");
        sayi=scan.nextInt();

        if (sayi>0)
        {
            System.out.println("sayı pozitif");
        }
        if (sayi%2==0)
        {
            System.out.println("sayı çift");
        }
        if (sayi%2!=0)
        {
            System.out.println("sayı tektir");
        }

        if (sayi%5==0)
        {
            System.out.println("Sayı 5'in tam katı");
        }
    }
}
