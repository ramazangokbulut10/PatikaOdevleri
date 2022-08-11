package day44_collections;

import java.util.*;

public class C06 {
    public static void main(String[] args) {



        /*
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin
         */

        Set<Integer> treeS=new TreeSet<>();
        int sayi=0;
        int sayiAdet=0;
        Random rnd=new Random();
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);//startTime = 1660202443334

        while (sayiAdet<=100){

            sayi=rnd.nextInt(500);
            treeS.add((Integer)sayi);
            sayiAdet++;

        } long endTime = System.currentTimeMillis();
        System.out.println(endTime);//endTime = 1660202443336




        int sayi2=0;
        int sayiAdet2=0;
        Set<Integer>has=new HashSet<>();
        long startTime2 = System.currentTimeMillis();//startTime = 1660202443336
        System.out.println(startTime2);
        while (sayiAdet<=100){

            sayi=rnd.nextInt(500);
            has.add((Integer)sayi);
            sayiAdet++;

        }

        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2);//endTime = 1660202443336

    }
}
