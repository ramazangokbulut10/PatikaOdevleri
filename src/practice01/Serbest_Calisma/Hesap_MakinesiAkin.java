package practice01.Serbest_Calisma;

import java.util.Scanner;

public class Hesap_MakinesiAkin {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan=new Scanner(System.in,"ISO-8859-9");
        System.out.println("""
                Lutfen yapmak istediginiz islemi seciniz
                1-Toplama
                2-Çikarma
                3-Çarpma
                4-Bolme
                """);
        char islem=scan.next().charAt(0);
        System.out.println("Lutfen 1.sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz");
        double sayi2=scan.nextDouble();
        switch (islem) {
            case '1' -> System.out.println("Girilen sayilar toplami: "+(sayi1 + sayi2));
            case '2' -> System.out.println("Girilen sayilar farki: "+(sayi1 - sayi2));
            case '3' -> System.out.println("Girilen sayilar carpimi: "+(sayi1 * sayi2));
            case '4' -> System.out.println("Girilen sayilar bolumu: "+(sayi1 / sayi2));
            default -> System.out.println("gecersiz islem");
        }

    }


}
