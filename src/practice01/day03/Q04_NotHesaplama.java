package practice01.day03;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        int vize1,vize2,finalNot;
        System.out.println("vize1 : ");
        vize1=scan.nextInt();
        System.out.println("vize2 : ");
        vize2=scan.nextInt();
        System.out.println("finalNot : ");
        finalNot=scan.nextInt();
        double sonuc=((vize1+vize2)/2)*0.3+finalNot*0.7;
        System.out.println("Notunuz : "+(sonuc));

    }
}
