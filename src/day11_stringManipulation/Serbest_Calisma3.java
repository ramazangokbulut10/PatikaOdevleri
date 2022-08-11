package day11_stringManipulation;

import java.util.Scanner;

public class Serbest_Calisma3 {
    public static void main(String[] args) {

        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */

     /* Birinci Benim Yaptığım Çözüm:::sadece indexOf() kullanarak çözdüm

        Scanner scan=new Scanner(System.in);

        System.out.println("Cümle Girin");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Kelime Girin");
        String kelime=scan.nextLine().toLowerCase();

        int kelimeIndex=cumle.indexOf(kelime);
        int kelimeIkinciIndex=cumle.indexOf(kelime,kelimeIndex+1);


        if (kelimeIndex==-1)
        {
            System.out.println("Girilen Kelime Cümlede Kullanılmamış");


        } else if (kelimeIkinciIndex!=-1) {
            System.out.println("Girilen kelime 1 den fazla kullanılmış");

        }else {
            System.out.println("Girilen Kelime 1 kere kullanılmıştır");
        }*/

        //İkinci Çözüm:indexof() ve lastIndexOf() kullanarak çözüldü

        Scanner scan=new Scanner(System.in);
        System.out.println("Cümle Girin");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Kelime Girin");
        String kelime=scan.nextLine().toLowerCase();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if(ilkIndex == -1 )
        {
            System.out.println("Verilen Kelime Cümlede Kullanılmamış");
        }else if(sonIndex ==ilkIndex){
            System.out.println("Girilen kelime 1 kere kullanılmıştır");

       }else {
            System.out.println("Girilen kelime 1 den fazla kullanılmıştır");
        }


    }
}
