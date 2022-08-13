package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {


        int sayi1=23;
        int sayi2=5;
        System.out.println(sayi1/sayi2);// 4 (4.6) ikisi de integer oldugundan en yakın sayıya yuvarlar ama aşağıya doğru.

        System.out.println(25*7/3);     //   58 (58.666)

        double sayi3=5;
        System.out.println(sayi1/sayi3); //4.6 iki variablede data türünde daha kapsamlı olanın türüne göre yazdırır.

        // Kapsamadan kastımız
        // byte < short < int < long < float < double      sıralaması vardır.

    }
}
