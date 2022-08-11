package day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayıyı çarpıp sonucu bize donduren bir method oluşturun

        int sayi1=10;
        int sayi2=3;
       int sonuc= carpGetir(sayi1,sayi2);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        int carpim=sayi1*sayi2;
        System.out.println(carpim);
        return carpim;

    }
}
