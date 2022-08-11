package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /* Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

        */

        Scanner scan=new Scanner(System.in);

        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;


        while (!sifreBasariliMi){

            System.out.println("Lutfen bir sifre giriniz");//kullanıcıdan sifre aldık
             sifre=scan.nextLine();
                                                             // 4 kontrolu yaptık
            if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                System.out.println("Ilk harf Buyuku olmali");
            }else {
                kontrol++;
            }if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){
                System.out.println("Son harf küçük olmali");
            }else {
                kontrol++;
            }if(sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            }else {
                kontrol++;
            }if(sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("Sifre en az 8 karakter olmali");
            }if(kontrol==4){
                System.out.println("Islem Basarili");
                sifreBasariliMi=true;
            }else {
                System.out.println("BASARISIZZ");
                kontrol=0;
            }

        }

    }
}
