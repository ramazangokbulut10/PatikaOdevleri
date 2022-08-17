package day10_StringManipulation;

public class  C01_charAt {
    public static void main(String[] args) {

        /*
        charAt kullanırken ilk harfi 0'dan alarak saymaya başlar !

        charAt() kullandıgımızda sonuc char olacağı icin artik manipulasyon yapamayız.
        yani toUpperCase, yani toLowerCase  tüm methodlarda böyle önce yapmak gerekir.
         */
        String str="java ögrenmek ne guzel";

        System.out.println(str.charAt(0));//j çıktısını verir

        System.out.println(str.toUpperCase().charAt(7));//R çıktısını verir

       // System.out.println(str.charAt(22));  bu satır variable nin sınırları dışında veri isteyince hata verdi


        String a="Aleyna",b=" Kabaci";
        System.out.println(a.concat(b));



    }
}
