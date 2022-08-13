package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {

      /*
      Swap iki sayının değerini birbiri ile değiştirmesine denir.
       */

    int sayi1=10,sayi2=20,toplam;
        System.out.println("Swaptan önce sayi1:"+sayi1);
        System.out.println("Swaptan önce sayi2:"+sayi2);

    toplam=sayi1+sayi2;
    sayi1=toplam-sayi1;
    sayi2=toplam-sayi2;
        System.out.println("Swaptan sonra sayi1:"+sayi1);
        System.out.println("Swaptan sonra sayi2:"+sayi2);






    }
}
