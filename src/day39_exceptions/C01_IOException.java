package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayaramiz daki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz

        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyay
        ekleme veya update yapmak istersek
        FileOutputputStream Class'indan yardim aliriz

         */
        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");



        /*
        Goruldugu gibi compile time'da altini kirmizi cizen
        her durum compile time error degildir.

        Java'da bazi exception'larda Compile time exception'dir.
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile time exception'dir

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir:

        1-) Try-Catch blogu ile cevrelemek
        2-) Method signature'ina trows keyword ile beklenen exception turunu yazmak

        trows exception , sadece olayin farkinda oldugumuzun deklarasyonudur
        exception'in handle edilmesinde hic bir rolu yoktur.

        Yani try catch ile kontrol altina aldigimiz exception'larda
        kod calismaya devam ediyordu.

        Ancak trows exception yazdigimiz da Java bir exception ile karsilasirsa
        yine hic bir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.



         */

    }
}
