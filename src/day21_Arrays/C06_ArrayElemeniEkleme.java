package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElemeniEkleme {
    public static void main(String[] args) {

        //C05 deki method'u kullanarak array'e eleman ekleyelim

        String[] takimListesi={"Suleyman","Osman","Talha"};
        String eklenecekIsim="Ahmet";

        takimListesi=C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));

    }

}
