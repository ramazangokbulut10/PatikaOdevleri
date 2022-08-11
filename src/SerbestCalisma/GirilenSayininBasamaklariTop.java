package SerbestCalisma;

import java.util.Scanner;

public class GirilenSayininBasamaklariTop {
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
