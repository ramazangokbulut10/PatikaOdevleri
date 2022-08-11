package day22_multiDimensionalArrays.sorular;

import java.util.Arrays;

public class Soru3AyniIndexdekileriTopla {

    public static void main(String[] args) {
        //Ayni index'te bulunan elemanlari toplayin

        int[][] arr1={{1,2},{3,4,5},{6}};
        int[][] arr2={{7,8,9},{10,11},{12}};
       // int[] yeniArray=new int[arr1.length];
        int toplam=0;

       for (int i = 0; i <arr1.length && i<arr2.length ; i++) {
           for (int j = 0; j < arr1[i].length && j<arr2[i].length ; j++) {
               toplam+=arr1[i][j]+arr2[i][j];
            }
           System.out.println(i+". indextekiler :"+toplam+" ");
           toplam=0;

        }
    }
}
