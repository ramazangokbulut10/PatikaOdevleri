package practice01.day04;

import java.util.Scanner;

public class Q03_SwithCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç basmaklı sayı girin");

        int sayi=scan.nextInt();

        int birlerBas=sayi%10;
        int onlarBas=(sayi/10)%10;
        int yuzlerBas=sayi/100;
if (sayi>99&&sayi<1000){
        switch (yuzlerBas) {
            case 0:System.out.println("");break;
                case 1: System.out.print("yüz\t"); break;
                case 2: System.out.print("ikiyüz\t"); break;
                case 3: System.out.print("üçyüz\t"); break;
                case 4: System.out.print("dörtyüz\t"); break;
                case 5: System.out.print("beşyüz\t"); break;
                case 6: System.out.print("altıyüz\t"); break;
                case 7: System.out.print("yediyüz\t"); break;
                case 8: System.out.print("sekizyüz\t"); break;
                case 9: System.out.print("dokuzyüz\t"); break;
                }
    switch (onlarBas) {
        case 0:System.out.print("");break;
        case 1: System.out.print("on\t"); break;
        case 2: System.out.print("yirmi\t"); break;
        case 3: System.out.print("otuz\t"); break;
        case 4: System.out.print("krık\t"); break;
        case 5: System.out.print("elli\t"); break;
        case 6: System.out.print("altmış\t"); break;
        case 7: System.out.print("yetmiş\t"); break;
        case 8: System.out.print("seksen\t"); break;
        case 9: System.out.print("doksan\t"); break;
    }
    switch (birlerBas) {
        case 0:System.out.print("");break;
        case 1: System.out.print("bir\t"); break;
        case 2: System.out.print("iki\t"); break;
        case 3: System.out.print("üç\t"); break;
        case 4: System.out.print("dört\t"); break;
        case 5: System.out.print("beş\t"); break;
        case 6: System.out.print("altı\t"); break;
        case 7: System.out.print("yedi\t"); break;
        case 8: System.out.print("sekiz\t"); break;
        case 9: System.out.print("dokuz\t"); break;
    }


        }



    }
}
