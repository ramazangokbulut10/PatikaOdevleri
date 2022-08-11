package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
     /*   Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
      islemi bitirmek icin 0’a basmasini soyleyin.
                Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
                 “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
         yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
      */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negatifSayiAdedi=0;
        int toplam=0;
       do {
           System.out.println("Sayi girisi yapin :");
           sayi=scan.nextInt();
           if (sayi<0){
               negatifSayiAdedi++;
               System.out.println("Negatif sayi giremezsiniz.");
           } else if (sayi>0) {
               pozSayiAdedi++;
               toplam+=sayi;

           }

       }while (sayi!=0);
        System.out.println("Pozitif sayi adedi : "+pozSayiAdedi);
        System.out.println("Negatif sayi adedi : "+negatifSayiAdedi);
        System.out.println("Pozitif Girilen Sayilarin Toplami: "+toplam);






}
}
