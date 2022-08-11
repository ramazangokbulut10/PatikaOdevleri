package ZoomCalismalari;

import java.util.Arrays;
import java.util.Scanner;

public class sil {
    public static void main(String[] args) {
        int[] arr=new int[5];
        enKucukEnbuyukFarkiBul(arr);
    }
    private static void enKucukEnbuyukFarkiBul(int[] arr) {
        Scanner scan=new Scanner(System.in);
        int sayac=1;

        while (sayac<=5){
            System.out.println("Element girin:");
            arr[sayac-1]= scan.nextInt();
            sayac++;
        }

        int enBuyuk=arr[0];
        int enKucuk=arr[0];
        for (int each:arr) {
            if(each>enBuyuk){
                enBuyuk=each;
            } else if (each<enKucuk) {
                enKucuk=each;
            }
        }
        System.out.println(enBuyuk+" "+enKucuk);
        System.out.println(Arrays.toString(arr));
        System.out.println("En buyuk - En Kucuk = "+(enBuyuk-enKucuk));
    }
}
