package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {

    public static void main(String[] args) {
       // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar ={3,5,7,1,4,9,5,2,155};

        maxSayiyiYazdir(sayilar);
    }
    private static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0];//maxSayi ya gecici deger atamak icin bu tanimlamayi yaptik

        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i] > maxSayi) {
                maxSayi=sayilar[i];
            }
        }
        System.out.println(maxSayi);
    }
}
