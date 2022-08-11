package practice01.day08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class soru8_Arrays {
    /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int[] arr=new int[8];

        for (int i=0;i< arr.length;i++){
            System.out.println(i+". elemani girin");
            arr[i]=scan.nextInt();
            if (arr[i]%3==0){
                count++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("3 bolunebilen sayilarin adedi : "+count);


    }
}
