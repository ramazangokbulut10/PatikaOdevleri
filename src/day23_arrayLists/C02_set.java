package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        //List'teki bir urun yerine baska bir urun ekleme
        //eski urunu de baska bir liste ekleme

        List<String> urunler=new ArrayList<>();// ana list'imiz burasi
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler=new ArrayList<>();//silinen urunleri buraya kaydedecegiz

        String yeniUrun="Biskrem";  //girilecek yani urun
        String silinecekUrun="Ikram";//eski urun


      int temp= urunler.indexOf("Ikram");   //set kodunu kullanmak icin eski urunun index'i gerekli,
                                             //buyuzden urunler Listindeki Ikram'in indexine bakiyoruz
        urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinecekUrun);
        System.out.println("eskiUrunler Listi:"+eskiUrunler);
        System.out.println("Guncellenmis List:"+urunler);

//------------------------------------------------------------------------------------------

         yeniUrun="Kahve";  //girilecek yani urun
         silinecekUrun="Cay";//eski urun
        temp=urunler.indexOf("Cay");

        urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinecekUrun);

        System.out.println(urunler);
        System.out.println(eskiUrunler);





    }
}
