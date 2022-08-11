package day14_MethodCreation;

import static day14_MethodCreation.C03_MethodCreation.ismiGizle;

public class C04_MethodCreationReturn {
    // verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip
    // bize bu halini donduren bir method olusturun
    // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

    public static void main(String[] args) {

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyIsim);
        System.out.println(gizliIsim);
  }

    public static String isimGizle(String isim, String soyIsim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        return  isim+" "+soyIsim;


    }


}
