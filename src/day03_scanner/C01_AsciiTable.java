package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //Bir tam sayı bir char değişken oluşturun ve bunların toplamlarını yazdırın.

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);//10+97
        System.out.println(str+harf);//banana
        System.out.println(harf+2);//97+2

        //char yeniHarf=harf+2;
           /*

           1- char data türü işleme girdiği değişkenin türüne göre farklı davranabilir
              eger matematiksel işleme girdiği variable sayısal bir değerse sayi gibi davranabilir
              sayi+harf sayi variable i int olduğundan harf variable i ascii tablosundan 97 değerini kullanır

              char yeniHarf =harf+2; java once sağdaki işlemi yapar, sağdaki int+char görünce ascii
                             sonra atama işlemi ypamaya çalışır
                             char yeniHarf=99;
                             bu atama java acisindan kabul edilebilir değildir
            2-str+harf; banana String variable çok güçlüdür, hangi data türü ile işleme girerse girsin diğer data
            turunu kendine benzetir.

            */

        //konsol da verilen variable ları kullanarak 10a görmek istersek nasıl yazarız

        System.out.println(""+sayi+harf);//tırnak işraretleri içerisini String e çevirdi.
    }
}
