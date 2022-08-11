package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
//        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifListesi={"Ali Can","Abuzer"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yeniSinifListesi=new String[sinifListesi.length+1];//var olan arraya 1 tane daha eleman eklemek icin
                                                                    // arrayin eleman sayisini boyle tanimladik
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }yeniSinifListesi[sinifListesi.length]=eklenecekIsim;

        return yeniSinifListesi;
    }
}
