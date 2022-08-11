package day15_overloading_forloop;

import java.util.Scanner;

public class FaizSorusu {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ana parayı girin : ");
        double anaPara=scan.nextInt();
        System.out.println("Kaç sene vadeli yatırmak istersiniz : ");
        int vade=scan.nextInt();

        for (int yil=1;yil<=vade;yil++){
            anaPara+=anaPara*0.6;
            System.out.println("Paranız "+yil+". "+"yıl "+anaPara+" miktarına ulaştı");
        }

    }
}
