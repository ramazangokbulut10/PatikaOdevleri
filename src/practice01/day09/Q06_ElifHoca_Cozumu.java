package practice01.day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_ElifHoca_Cozumu {
    public static void main(String[] args) {
        /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */
        farkiniBul();
    }
    private static void farkiniBul() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("array uzunlugunu girin: ");
        int uzunluk=scanner.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("array'in "+(i+1)+". elemanini giriniz :");
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println((arr[arr.length-1])-(arr[0]));

        //odev bu soruyu Math classi ile cozun
    }
}
