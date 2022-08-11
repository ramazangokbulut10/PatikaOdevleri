package practice01.Serbest_Calisma;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime Girin : ");
        String kelime=scan.nextLine();

        if(kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2));
            System.out.println(kelime.substring(kelime.length()-2));
            System.out.println(kelime.substring(kelime.length()-2));

        }else {
            System.out.println(kelime);
            System.out.println(kelime);
            System.out.println(kelime);
        }

       String output=kelime.length()>=3?kelime.substring(kelime.length()-2).concat(kelime.substring(kelime.length()-2)).concat(kelime.substring(kelime.length()-2)):
                kelime;
        System.out.println(output);
    }
}
