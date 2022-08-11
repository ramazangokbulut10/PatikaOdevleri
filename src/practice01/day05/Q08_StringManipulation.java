package practice01.day05;

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
        System.out.println("Bir kelime Girin : ");
        String kelime=scan.nextLine();

        if(kelime.length()>=3){
            System.out.print(kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2));

        }else {
            System.out.println(kelime);
        }


    }
}
