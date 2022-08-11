package day12_stringManipulation;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo=" 1234 6589 7856 4589";

        System.out.println(isim.substring(3));//çıktısı eyman
        System.out.println(soyisim.substring(soyisim.length()-3));// çıktısı fil

        System.out.println(isim.substring(2,4));//2.dahil-4.dahildeğil arasını verir //le

        //isim ve soyisimin ilk harfi buyukharf,geriye kalan *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");
        String soyIsimIlkHarf=isimIlkHarf.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyIsimIlkHarf+soyisimGeriyeKalanlar+"\n"+
                kkIlk4+kkGeriyeKalanlar);

    }
}
