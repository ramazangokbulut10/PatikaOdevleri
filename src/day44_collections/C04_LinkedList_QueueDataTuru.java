package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        /*
        Queue kuyruk demektir.sira onemlidir
        gelen sona gelir,giden bastan gider
         */
        System.out.println("ll3 = " + ll3);//ll3 = [Adem, Zeynep, Hpolat, Kadir]

        System.out.println("ll3.remove() = " + ll3.remove());//ll3.remove() = Adem-->remove en bastakini siler
         System.out.println("ll3 = " + ll3);//ll3 = [Zeynep, Hpolat, Kadir]
        System.out.println(ll3.remove("Hpolat"));//true
        System.out.println("ll3 = " + ll3);//ll3 = [Zeynep, Kadir]

        System.out.println("ll3.peek() = " + ll3.peek());//ll3.peek() = Zeynep
        System.out.println("ll3.poll() = " + ll3.poll());//ll3.poll() = Zeynep
        System.out.println("ll3 = " + ll3);//ll3 = [Kadir]
        System.out.println("ll3.element() = " + ll3.element());//ll3.element() = Kadir

        Queue<String> ll4=new LinkedList();
        System.out.println(ll4.poll());//null--> poll ile remove ayni ise yarar
        ll3.offer("Ahmet");
        System.out.println("ll3 = " + ll3);//ll3 = [Kadir, Ahmet]
        ll3.offer("Sefa");
        System.out.println("ll3 = " + ll3);//ll3 = [Kadir, Ahmet, Sefa]
        System.out.println("ll3.remove() = " + ll3.remove());//ll3.remove() = Kadir
        /*
            silmeler --->bastan
            eklemeler --->sondan
         */
        //System.out.println("ll4.remove() = " + ll4.remove());//NoSuchElementException


    }
}
