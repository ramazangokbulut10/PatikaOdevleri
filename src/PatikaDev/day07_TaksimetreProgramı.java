package PatikaDev;

import java.util.Scanner;

public class day07_TaksimetreProgramı {
    public static void main(String[] args) {
        /*
     Taksimetre Programı
     Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

     Taksimetre KM başına 2.20 TL tutmaktadır.
     Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
     Taksimetre açılış ücreti 10 TL'dir.

         */

         double km=2.20;
         double acılısUcreti=10;

        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafeyi kilometre cinsinden giriniz.");
        double girilenkm=scan.nextDouble();
        double odenecektutar=(girilenkm*km)+acılısUcreti;
        odenecektutar=(odenecektutar<20) ? 20: odenecektutar;
        System.out.println(odenecektutar);




    }
}
