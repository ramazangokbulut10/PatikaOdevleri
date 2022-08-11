package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        // Binary search ile Array elemanlarinin icinde arama yapilir
        //ama önce Array'i SIRALAMANIZ gerkiyor, yoksa hatali sonuc alabiliriz.

        String[] harfler={"Y","B","D","G","O","A"};
        String arananHarf="A";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//array sirali olmadigi icin arama sonucunu dogru bulamayabilir

        Arrays.sort(harfler);                           //array'i siraladik
        System.out.println(Arrays.toString(harfler));//[A, B, D, G, O, Y]

        System.out.println(Arrays.binarySearch(harfler,arananHarf));//0

        System.out.println(C03_Contains.arananIsim(arananHarf,harfler));//true
    }
}
