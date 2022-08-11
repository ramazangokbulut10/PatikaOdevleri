package day20_Arrays;

import java.util.Arrays;

public class C03_lenght {
    public static void main(String[] args) {
        //iki sekilde array olusturabiliriz
        int sayilar[]={1,2,3};

        String harfler[]=new String[4];//[null, null, null, null]
        System.out.println(Arrays.toString(harfler));


        System.out.println("sayilar array'in uzunlugu : "+sayilar.length);
        System.out.println("harfler array'in uzunlugu : "+harfler.length);

        System.out.println(harfler[harfler.length-1]);//harfler array'inin son elementini yazdiralaim

    }
}
