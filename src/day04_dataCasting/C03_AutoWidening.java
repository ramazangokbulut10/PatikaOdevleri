package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        byte sayi1=23;
        short sayi2=55;

        int sayi3=sayi1+sayi2;    //88
        System.out.println(sayi3);

        double sayi4=sayi1*sayi2; //1265.0
        System.out.println(sayi4);

        //Burada java önce eşitlikten sonrasını yapıp sonra variableye eşitlediğini inceleyeceğiz
        sayi4=(double)sayi2/sayi1;// sayi2 yi double yaptık ve böylece geniş olana göre cevap verdi.
        System.out.println(sayi4);
        sayi4=sayi2/sayi1;        // double yi yazmayınca cevap 2.0 çıkıyor
        System.out.println(sayi4);
      /*  char harf='b';

        char harf2=harf;
        System.out.println(harf2);

        int sayi1=11;
        float sayi=sayi1;
        System.out.println(sayi);


       */

    }
}
