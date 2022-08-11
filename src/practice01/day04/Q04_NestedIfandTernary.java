package practice01.day04;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {

          /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/

        int sayi=5;
       String sonuc="";
       if (sayi>0&&sayi<9){
           if (sayi == 9) {sonuc="dokuz";}
           else if (sayi==8) {sonuc="sekiz";}
           else if (sayi==7) {sonuc="yedi";}
           else if (sayi==6) {sonuc="altı";}
           else if (sayi==5) {sonuc="beş";}
           else if (sayi==4) {sonuc="dört";}
           else if (sayi==3) {sonuc="üç";}
           else if (sayi==2) {sonuc="iki";}
           else if (sayi==1) {sonuc="bir";}
           else {sonuc="sıfır";}

       }else {sonuc="Geçersiz";}
        System.out.println(sonuc);

        System.out.println(sayi==9?"Dokuz":sayi==8?"Sekiz":sayi==7?"Yedi":sayi==6?"Altı":sayi==5?"Beş"
                :sayi==4?"Dört":sayi==3?"Üç":sayi==2?"İki":sayi==1?"Bir":"Hatalı");

        }



    }

