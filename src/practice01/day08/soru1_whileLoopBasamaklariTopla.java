package practice01.day08;

import java.util.Scanner;

public class soru1_whileLoopBasamaklariTopla {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        System.out.println(basamakToplama(sayi));

    }
    private static int basamakToplama(int sayi) {
        int toplam=0;
        while (sayi!=0){
         toplam+=sayi%10;
         sayi/=10;

        }
        return toplam;
    }
}
