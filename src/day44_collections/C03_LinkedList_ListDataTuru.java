package day44_collections;

import java.util.*;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {
        /*
        set(kume)-->         benzersiz kumeler gibi uniq
        Queue-->(Sıra)           yemekhane kuyrugu gibi dusunulebilir
        linked (Halay)-->   birbirine bagli====ekleme cikarma da hizli, eleman bulma da yavastir
        Tree (Agac gibi)-->  dogal sirali ozel  sorltlanmis gibi
        hash(hizli) -->      ozel raf adi sayesinde hizli erisim
         */
        /*
        LinkedList
    Halaya benzer, birbirine bagli. Ekleme ve cikarmada rahat, arama yaparken yavas.
    Ilk eleman her zaman head'dir. Head'te data yoktur, sadece adress vardir.
    Son eleman(tail) null'i point eder.
    Her elemanin icinde data ve adress kismi olmak uzere iki kisim vardir.
    Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
    Her eleman node olarak adlandirilir.
         */

        LinkedList ll1=new LinkedList();

        List<String> ll2=new LinkedList();

        Queue<String> ll3=new LinkedList();

        Deque<String> ll4=new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println("ll2 = " + ll2);
        System.out.println(ll2.remove(3));//Ayse
        System.out.println("ll2 = " + ll2);//ll2 = [Berk, Done, Enes]
        System.out.println(ll2.remove("Enes"));//true
        System.out.println(ll2.remove("Kemal"));//false
        /*
        Eger listemiz Integer elementlerden olusuyorsa
        direk sayi yazarsak index olarak kabul eder
        Ama bir variable'a atama yapar ve remove'da
        o variable'in ismini yazarsak obje olarak
        kabul eder.
         */
        ll2.add(1,"Serap");
        System.out.println("ll2 = " + ll2);//ll2 = [Berk, Serap, Done]
        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println("ll1 = " + ll1);//ll1 = [Berk, Ismail]
        ll2.retainAll(ll1);/*ll1 ve ll2 nin ortak elemanlarini birakir gerisini siler
        */
        System.out.println("ll2 = " + ll2);//ll2 = [Berk]

        System.out.println("ll2.hashCode() = " + ll2.hashCode());//2066939



    }
}
