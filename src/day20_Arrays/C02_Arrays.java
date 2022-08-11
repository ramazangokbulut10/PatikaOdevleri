package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println(sayilar); //[I@4dd8dc3

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar[2]+sayilar[0]);
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));
        sinifList[1]="Hasan";                   //sinifList[1] deki "Ayse"yi "Hasan olarak degistirirdik.
        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[0]); //sinifList[] de istenilen indexdekini yazdırabiliriz
    }
}
