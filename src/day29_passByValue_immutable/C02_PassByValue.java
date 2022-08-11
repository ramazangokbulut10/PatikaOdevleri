package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
         verilen 4 elemanli bir array i
        method a gonderelim method da
        yeni 3 elemanli bir array atayip
        bu yeni array e rastgele 100 den kucuk
        3 sayi atayalim
        method da array i yazdiralim
        main method da da method call dan sonra yenide method u yazdiralim
         */
        int[] arr={3,5,8,10};
        System.out.println("Array'in ilk hali: "+Arrays.toString(arr));//[3,5,8,10]
        arrayiDegisti(arr);//[42, 10, 8]
        System.out.println(Arrays.toString(arr));//[3, 5, 8, 10]
    }

    private static void arrayiDegisti(int[] arr) {
        Random rnd=new Random();
        arr=new int[3];
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println("Method'da array: "+Arrays.toString(arr));
    }
}
