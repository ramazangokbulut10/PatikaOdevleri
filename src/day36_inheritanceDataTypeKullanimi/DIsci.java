package day36_inheritanceDataTypeKullanimi;

import day34_inheritance.Isci;

import java.util.*;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler: "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturulurken Data turu ve const. ayni class'dan ise
        direk o class'a gidiyorduk.

        Eger Data turu ve const. farkli ise 2 durum vardir.
        Oncelikle Data turunun oldugunun class'a gideriz
        Obje const. oldugu class'in objesidir.
        ancak bizden istenen isci class'indaki spesifik
        ozellikler degil bir iscinin muhasebe class'indaki tum calisanlarla beraber
        sahip oldugu genel ozellikleri yazdirir


         */
        System.out.println(isc1.gunlukMesai);//8-->Muhasebeden alir
        System.out.println(isc1.saatUcreti);//10-->Muhasebeden alir
        isc1.maas();//-->BMuhasebeden alir Personel minumum : 2400 maas alir
        isc1.ozelSigorta();//-->Muhasebeden alir  isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta();//-->Personelden alir Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim);//-->Personelden alir
        System.out.println(isc1.soyIsim);//-->Personelden alir
        System.out.println(isc1.departman);//-->Personelden alir

        APersonel isc2=new DIsci();

        //System.out.println(isc2.gunlukMesai);--->
        //System.out.println(isc2.saatUcreti);--->
        //isc2.ozelSigorta();//-->Muhasebeden alir  isteyen calisanlara %50 indirimli ozel sigorta yapilir
        //isc2.ozelSigorta();--->P
        isc2.maas();//2400 Bmuhasebeden alir
        isc2.sigorta();//-->Personelden alir Tum personelimiz sigorta yapilir
        System.out.println(isc2.isim);//-->Personelden alir
        System.out.println(isc2.soyIsim);//-->Personelden alir
        System.out.println(isc2.departman);//-->Personelden alir


        /*
        Eger Data turu olan class'da aradigimiz ozellik yoksa,
        varsa onun parent'ina gidebilir ama child'a
        donus olmaz

        Aradigi ozelligi bulamazsa CTE verir
         */

        List<Integer> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */



    }
}
