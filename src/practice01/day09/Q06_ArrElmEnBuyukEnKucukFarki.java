package practice01.day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_ArrElmEnBuyukEnKucukFarki {
    /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturulacak arrayin eleman sayisini girin : ");
        int elemanSayisi=scan.nextInt();    //Kullaniciya arrayi disaridan girdirmemi istedigi icin mecbur olarak eleman
        int[] arr=new int[elemanSayisi];    //sayisini sormak zorundayiz onun icin burayi yazdim

        enBuyukEnkucukFarki(arr);           //methodla farklari bulduran satir

    }
    private static void enBuyukEnkucukFarki(int[] arr) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {//buradaki for loopla arrayin eleman sayisi kadar disaridan eleman girdiriyoruz
            System.out.println("Lutfen "+(i+1)+". elemani girin:");//her for donerken bize eleman girmemiz gerektigi uyarisi veridiriyoruz
            arr[i]=scan.nextInt();            //disaridan girilen sayiyi arrayin i. elemanina atiyoruz
        }
        System.out.println(Arrays.toString(arr));//olusturdumuz

       int buyuk=arr[0];
       int kucuk=arr[0];

        for (int each:arr) {
          if (buyuk<each) {
              buyuk=each;
          } else if (kucuk>each) {
              kucuk=each;
          }
        }
        System.out.println("En buyuk eleman ile En kucuk elemanin Farki : "+(buyuk-kucuk));

    }
}
