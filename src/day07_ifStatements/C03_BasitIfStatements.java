package day07_ifStatements;

import java.util.Scanner;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı girin: ");
        sayi=scan.nextInt();
// Eğer if döngüsünde {} kullanmazsak sadece ilk satırı if şartına göre değerlendirir, diğerlerini normal çalıştırır.
        if (sayi>0)

            System.out.println("sayı pozitif");
            System.out.println("Pozitif Kalacaktır...");  //Her zaman çalışan satır

        if (sayi%2==0)

            System.out.println("sayı çift");
            System.out.println("Çift Kalacaktır...");       //Her zaman çalışan satır

        if (sayi%2!=0)

            System.out.println("sayı tektir");


        if (sayi%5==0)

            System.out.println("Sayı 5'in tam katı");

    }
}
