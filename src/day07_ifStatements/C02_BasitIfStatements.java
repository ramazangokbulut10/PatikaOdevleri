package day07_ifStatements;

import java.util.Scanner;

public class C02_BasitIfStatements {
    public static void main(String[] args) {

        //   int sayi;   bu şekilde boş bırakabiliriz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int sayi=scan.nextInt();

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
        /*
        Basit if cumleleri kodun diger parcalarından bagımsızdır,Sadece bir şart kontrol eder,şart sağlanıyorsa
        if bodysi calisir. Yoksa calismaz!
        Birden fazla basit if cumlesi varsa girilen şarta bağlı olarak tumunde if bodysi calisabilir. Kısmen if bodyleri
        calisabilir veya hicbir if bodysi calismayabilir.
         */
    }
}
