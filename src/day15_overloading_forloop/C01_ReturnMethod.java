package day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen iki sayıyı çarpıp sonucu bize donduren bir method oluşturun
        // Donduren dedigi icin void olamaz !!!!

        int sayi1=10;
        int sayi2=3;
        int sonuc= carpGetir(sayi1,sayi2); // Argümenti biz ekledik sayıyı biz verdik methodun içinde alsakta olabilirdi
        // return methodlarda olusturduğun methodu bir değişkene mutlaka atamalısın!
        System.out.println(sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
        int carpim=sayi1*sayi2;
        return carpim;

    }
}
