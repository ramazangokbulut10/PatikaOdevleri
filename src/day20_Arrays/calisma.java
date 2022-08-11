package day20_Arrays;

import java.util.Arrays;

public class calisma {
    public static void main(String[] args) {

        //Arraylerde eleman sayısında nasıl değişiklik yapılacağı ile ilgili örnekler

        int arr1[]={5,6,8,10};
       // arr1={15,16,17,18};//Tanımlamayı birüst satırda yapıldığı gibi olunca değişikliğe izin vermiyor altını çiziyor

        int arr2[]=new int[6];
        arr2=new int[4];//Tanımlamayı üst satıdaki gibi yapınca bu satırda olduğu gibi değişikliğe izin verir




        int sayilar[]=new int[6];

        String str="Java Cok Guzel";

        String[] kelimeler=str.split(" ");//bosluktan array elemanlarini ayirir
        System.out.println(Arrays.toString(kelimeler));




    };


}
