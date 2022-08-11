package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf_lastIndexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Ikram")); //1   bastan aramaya baslar
        System.out.println(urunler.lastIndexOf("Ikram"));   //1   sondan aramya baslar

//lastIndexOf u denemek icin List'in sonuna yeni element olarak Ikram ekleyelim
        urunler.add("Ikram");
        System.out.println(urunler.lastIndexOf("Ikram"));//4


//Olmayan element'i aratalim

        System.out.println(urunler.indexOf("Cokomel")); //-1


    }
}
