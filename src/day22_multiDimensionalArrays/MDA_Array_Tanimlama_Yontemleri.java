package day22_multiDimensionalArrays;

import java.util.Arrays;

public class MDA_Array_Tanimlama_Yontemleri {
    public static void main(String[] args) {

//1. array olusturma yontemi:

     int arr[][]=new int [3][2];//3 elementi olsun, her 3 elemetin de 2 elementi olsun

        // Burada arraydeki elementlerin uzunluklarini belirtilmesi gerekiyor
        //Her bir arrayi de asagida oldugu gibi tek tek tanimlamak gerekir

        System.out.println(Arrays.deepToString(arr));

        arr[0][0]=1;
        arr[0][1]=2;

        arr[1][0]=3;
        arr[1][1]=4;

        arr[2][0]=5;
        arr[2][1]=6;

        System.out.println(Arrays.deepToString(arr));

// 2. array olusturma yontemi :

        //Bu tanimlama yontemi ile de elementlerin hepsini onceden tanimlariz

        int [][] arr2={{7,8,9,2,12},{4,5},{1}};

        System.out.println(Arrays.deepToString(arr2));




    }
}
