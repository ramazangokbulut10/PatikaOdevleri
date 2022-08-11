package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

 /*
         "Integer sayılardan oluşan bir diziyi parametre olarak alan
         ve dizide 7 rakamı  var ise  "Boom!" ifadesini;
         aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
                Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"

         */

        int[] sayilar1={1, 2, 3, 4, 5, 6, 7};
        int[] sayilar2={8, 6, 33, 100};
        int[] sayilar3={2, 55, 60, 97, 86};

        for (int i = 0; i < sayilar1.length; i++) {
            if (sayilar1[i]==7){
                System.out.println("boom!");
            }
        }
        for (int i = 0; i <sayilar2.length ; i++) {
            if (!(sayilar2[i]==7)){

            }

        }
        System.out.println("dizide yedi rakamı yok");

        for (int i = 0; i < sayilar3.length ; i++) {
            if (sayilar3[i]==7){

            }

        }
        System.out.println("Boom!");
    }




}
