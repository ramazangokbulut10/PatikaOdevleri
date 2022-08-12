package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <dataTuru> nu Object secmeniz durumunda
        Collection'a farkli data turlerinde objeler koymaniza izin verir
        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan cok
        fazla casting yapmak zorunda kalabiliriz
         */
        List<Object> liste=new ArrayList<>();
        liste.add(5);
        liste.add("araba");
        liste.add('A');

        List list =new ArrayList();//-->List<Object> list =new ArrayList(); olarak kabul edilir
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list);//[5, s, true, Ali]

        Set<Object> set1= new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
        System.out.println(set1);//[5, 5, true]
       // System.out.println(); deneme.
    }
}
