package day10_StringManipulation;

import java.util.Scanner;

public class CumledeArananHarfVarMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle yazın");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Bir harf Girin");
        String harf=scan.next().toLowerCase();
        if(cumle.indexOf(harf)==-1)
        {
            System.out.println("YOĞĞ");

        }else {
            System.out.println("var");
        }


        /*Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cümle yaziniz : ");
        String str= scan.nextLine();
        System.out.print("Lutfen herhangi bir harf giriniz : ");
        String harf=scan.next().toLowerCase().charAt();
        if (str.indexOf(harf)==-1){
            System.out.println("Girdiginiz harf, yazdiginiz cumlede kullanilmamistir");
        }else {
            System.out.println("Girdiginiz harf, yazdiginiz cumlede kullanilmistir");
        }

         */




    }

}
