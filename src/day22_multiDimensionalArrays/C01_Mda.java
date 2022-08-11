package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*

         */
//                     0(sifirinci) 1(birinci)
        int [][] sayilar={{1,2,4,5}, {3,4}};

        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2 yazar
        System.out.println(sayilar[1][1]); // 4 yazar

        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        //-----------------------------Benim aciklamam-----------------------------------

        String [][] arr={{"Mustafa","SAK","Sevil"},{"Cafer","Betul","Halime"}};

        System.out.println(Arrays.deepToString(arr));// Array'in hepsini yazdirmak  [[Mustafa, SAK, Sevil], [Cafer, Betul, Halime]]

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0][0]);// 0. index'deki 0. elementi yazdirir // Mustafa





    }
}
