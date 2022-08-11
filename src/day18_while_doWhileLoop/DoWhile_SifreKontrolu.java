package day18_while_doWhileLoop;

import java.util.Scanner;

public class DoWhile_SifreKontrolu {
    /*
    Kullanicidan sifre girmesini isteyin;
    -Sifre kucuk harf ıcermeli
    -Sifre buyuk harf icermeli
    -Sifre ozel karakter icermeli
    -Sifre en az 8 karakter olmali
    Dogru sifer girinceye kadar bunlari tekrar ettirin
    dogru sifre girince "Sifreniz Kabul edilmistir" yazdirin.

     */

    public static void main(String[] args) {
    //    String temp="";
        String kucukHarf="";
        int kontrol=0;
        Scanner scan=new Scanner(System.in);
        do {

            kontrol=0;
            System.out.println("Sifre Girin : ");
            String sifre=scan.nextLine();

            if (sifre.length()<8)
            {
                System.out.println("Sifre en az 8 karakte olmalidir ");
                kontrol++;
            }

            for (int i = 0; i <sifre.length() ; i++) {
                if (!(sifre.charAt(i)>='a'&&sifre.charAt(i)<='z')){
                    System.out.println("Kucuk Harf icermeli");
                    kontrol++;
                }
                if (!(sifre.charAt(i)>='A'&&sifre.charAt(i)<='Z')){
                    System.out.println("Buyuk Harf icermeli");
                    kontrol++;
                }

            }


        }while (kontrol!=0);


    }
}
