package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        int[] sayilar={6,5,4,1,3};
        Arrays.sort(sayilar);//İlk önce Aray'i siraladik . . .

        System.out.println(Arrays.toString(sayilar));//[1, 3, 4, 5, 6]

    // Aranilan eleman array de varsa index e gore deger dondurur.(yani 0 dan saymaya baslar)
    // Aranilan eleman eger yoksa arrayde olsaydi eksi(-) olarak siradaki yerini verir(yani 1den baslar saymaya basina eksi koyar)


        System.out.println(Arrays.binarySearch(sayilar,4));//2 degeri döner
        System.out.println(Arrays.binarySearch(sayilar,7));//-6 degerini dondurur yani eger olsaydi 6. sirada olurdu demek
        System.out.println(Arrays.binarySearch(sayilar,11));//-6 degerini dondurur yani eger olsaydi 6. sirada olurdu demek
        System.out.println(Arrays.binarySearch(sayilar,6));//4
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1

    }
}
