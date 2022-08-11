package day14_MethodCreation;

public class C03_MethodCreation {
    //input olarak verilen isim ve soyismi
    //ilk harfi büyük, geriye kalan harfler * olacak şekilde
    //I****** K***** şeklinde yazdıran bir method oluşturun

    public static void main(String[] args) {

        String ad="Enes";
        String soyad="Bozkurt";

        ismiGizle(ad,soyad);
    }

    public static void ismiGizle(String isim, String soyisim) {
       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);

    }

}
