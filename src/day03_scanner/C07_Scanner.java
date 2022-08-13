package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
    //Tek seferde tüm bilgileri giriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz");
        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        // girilen bilgiler = seyfi capar 34  seklinde yazdirin
        System.out.println("girilen bilgiler = "+isim+","+soyisim+","+yas);
    }
}
