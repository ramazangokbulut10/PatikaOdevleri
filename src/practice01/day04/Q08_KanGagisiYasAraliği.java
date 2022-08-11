package practice01.day04;

import java.util.Scanner;

public class Q08_KanGagisiYasAraliği {
    public static void main(String[] args) {
        /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı girin : ");
        int yas=scan.nextInt();
        System.out.println("Kilonuzu girin : ");
        double kilo=scan.nextDouble();

        if(yas<18)
        {
            System.out.println("Kan Bağışı Yapamazsınız");
        } else if (kilo<50) {
            System.out.println("Kan Bağışı Yapamazsınız");
        } else {
            System.out.println("Kan Bağışı Yapabilirsiniz");
        }

        }


}
