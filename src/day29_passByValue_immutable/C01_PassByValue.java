package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturun
        Bir methodla arrayin 2. ve 4. elemanlarini 100'den kucuk bir sayi ile degistirin
        yeni halini yazdirin
         */
        int[] arr={5,7,8,10};
        elemanDegistir(arr);
        System.out.println("elemanDegistir methodu calistiktan sonra : "+Arrays.toString(arr));//degistirilmis Array gelecek
    }
    private static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));
    }
}
