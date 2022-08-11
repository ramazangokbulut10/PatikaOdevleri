package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("liste = " + liste);//liste = [10, 20, 30]

        //Listedeki tum elementleri index kullanmadan 3 arttirin
        for (int each:liste) {
            each+=3;
            System.out.print(each+" ");//13 23 33

        }
        System.out.println("");
        System.out.println(liste);//[10, 20, 30]

        /*
        Java index yapisi olmayan collection'lardaki elementlere ulasmak ve
        degistirmek icin iterator interface'ini olusturmustur

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        Bunun yerine bize iterator donduren liste.iterator() method'unu kullaniyoruz

         */
        System.out.println("liste = " + liste);//liste = [10, 20, 30]

        Iterator it1= liste.listIterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30


        //Iterator'da geri donus yok adim adim sona ulastiktan sonra
       // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir
        Iterator it2= liste.iterator();
        /*
        Yeni it2 iterator kullanarak listenin tum elementlerine silelim
         */
        System.out.println(liste);//[10, 20, 30]
       it2.next();
       it2.remove();
        System.out.println(liste);//[20, 30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[]
        System.out.println(it2.hasNext());//false
        /*
        Iterator ile elementleri gezip remove yapinca liste kalici
        olarak degisti
         */
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Loop'tan once liste : "+liste);//Loop'tan once liste : [10, 20, 30]
        Iterator it3= liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("Loop'tan sonra liste : "+liste);//Loop'tan sonra liste : []
        /*
        Goruldugu gibi iterator kullanarak yapabildigim
        1-)Tum collection elementlerini yazdirmak
        2-)Tum collection elementlerini silmek
        Bu da bize yetmez
         */


    }
}
