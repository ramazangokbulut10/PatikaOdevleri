package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        //

        int sayi1=-129;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);

        /*
        Geniş data türündeki değeri, dar data türündeki variableye atamak isterseniz
        Java sizin geniş data türündeki değerin, dar data türünün sınırlarına uyup uymayacağını
        calıştırana kadar bilemez
        Ama Java RİSK ALMAZ..
        Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler
        bunun için degerin önüne parantez içerisinde istediğimiz data türünü yazmamız yeterlidir.

        bu riski üstlendiğimizde , 3 durum oluşabilir.
        1- bizim değerlerimiz, dar kalıp değerlerine uygun olursa hiç bir kayıp olamdan cast olur
        2-double bir sayıyı int'a cast
         */
    }
}
