package practice01.Serbest_Calisma;

import java.util.Scanner;

public class Hesap_Makinesi {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("2 Sayıyı entera basarak girin giriniz : ");
        double sayi1=scan.nextDouble(),sayi2=scan.nextDouble();
        System.out.println("Yapmak istediğiniz işlemin işaretini seçin :\n+(Toplama)\n-(Çıkarma)\n*(Çarpma)\n/(Bölme)");

        String islemIsareti=scan.next();


     //   System.out.println(islemIsareti.equals("+")?sayi1+sayi2:islemIsareti.equals("-")?sayi1-sayi2:islemIsareti.equals("*")?sayi1*sayi2:islemIsareti.equals("/")?sayi1/sayi2:"İşlem Hatalı");

        switch (islemIsareti) {
            case"+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;


        }


    }
}
