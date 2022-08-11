package day45_collections;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        /*
        Verilen bir array'deki tekrar eden elementleri
         silip tekrarsiz halini array'e atayan kod yaziniz
         */

        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet=new HashSet<>();
        for (int w:arr) {
            tekrarsizSet.add(w);

        }/*
        System.out.println(tekrarsizSet);
        Integer[] arr2= tekrarsizSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));
        */




        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        int i=0;
        for (Integer each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr));//[4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6]
        arr=tekrarsizArr;//---->eski array'e yeni array olusturup atama yapabiliriz!!!!!
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



        System.out.println("************************");
        int[] arr3={1,2,3,4,5,1,2,3,4,5};
        arr=arr3;// eski arr  arrayi sadece yeni olusturulan arr3 gibi ayni uzunluktaki bir array'e esitlenebilir
        System.out.println(Arrays.toString(arr));





    }
}
