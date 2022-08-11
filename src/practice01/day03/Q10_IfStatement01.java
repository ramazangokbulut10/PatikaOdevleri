package practice01.day03;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Y/N girin :");
        char karakter=scan.next().charAt(0);
        if(karakter=='y'||karakter=='Y')
        {
            System.out.println("YES girişi yaptınız");
        } else if (karakter=='n'||karakter=='N') {
            System.out.println("NO girişi yaptınız");

        }else {
            System.out.println("Hatalı giriş");
        }


    }

}
