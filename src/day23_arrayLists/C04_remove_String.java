package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove_String {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();// ana list'imiz burasi
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println("Urunler Listesi :"+urunler);
        System.out.println(urunler.remove("Ikram"));        //true
        System.out.println("Urunler Listesi Ikram Silindikten Sonra :"+urunler);

        System.out.println(urunler.remove("Canpare"));// Boyle urun oladigi icin false doner


        System.out.println(urunler.remove(1));  //1. index'dekini siler
        System.out.println(urunler);        //[Nutella, Cay]  Cekirdek silindikten sonra
    }
}
