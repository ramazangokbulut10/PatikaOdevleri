package day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen 2 int'i toplayip sonucu yazdiran bir method olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        toplaYazdir(sayi1,sayi2);
    }
    private static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("Verilen iki sayinin toplami : "+(sayi1+sayi2));
    }

}
