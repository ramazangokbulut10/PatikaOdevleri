package day11_stringManipulation;

import java.util.Scanner;

public class Serbest_Calisma2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cümle girin");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println("Cümlede Bulmak İstediğiniz harfi yazın");
        char harf=scan.next().toLowerCase().charAt(0);
        int harfIndex=cumle.indexOf(harf);
        if (harfIndex==-1){
            System.out.println("Cümlede girilen harf Yoktur");
        }else {
            System.out.println("Girilen harf "+harfIndex+". sıradadır");
        }
    }
}
