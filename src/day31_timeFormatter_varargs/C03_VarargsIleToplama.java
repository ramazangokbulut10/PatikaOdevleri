package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    //verilen ikiden fazla int'i toplayip sonucu yazdiran bir method olusturun
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
          /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir
         */
    }
    private static void toplaYazdir(int... sayi) {
        int toplam=0;
        for (int each:sayi) {
            toplam+=each;
        }
        System.out.println("Girilen sayilarin toplami :"+toplam);
    }
}
