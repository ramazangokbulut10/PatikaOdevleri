package day21_Arrays;

import java.util.Arrays;

public class C07_sort_YaniArraySiralama {

    public static void main(String[] args) {

        int[] sayilar={5,7,1,6,8,23,8,3};
        Arrays.sort(sayilar);                           // Array siralama kodu
        System.out.println(Arrays.toString(sayilar));

        String[] str={"abdi","adil","afra","ayhan","abdullah"};
        Arrays.sort(str);                               // Array siralama kodu
        System.out.println(Arrays.toString(str));


    }
}
