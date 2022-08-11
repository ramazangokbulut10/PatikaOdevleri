package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        // String girilen bir variableyi array olarak belirrtigimiz karakter den bolerek arraye eleman atar
        String str="Java ne kadar guzel";
        String[] kelimeler=str.split(" ");//[Java, ne, kadar, guzel]
        System.out.println(Arrays.toString(kelimeler));

        String[] kelimelerE=str.split("e"); //[Java n,  kadar guz, l]


        String[] karakter=str.split("");        //[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]
        System.out.println(Arrays.toString(karakter));


    }


}
