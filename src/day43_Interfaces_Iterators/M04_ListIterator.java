package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        /*
        List iterator, iterator interface'inin child interface'idir
        ama daha cok method'a sahiptir.
         */

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);//[10, 20, 30]

        Integer temp;
        ListIterator lit1=list.listIterator();



        while (lit1.hasNext()){
            temp=(Integer) lit1.next();
            temp+=3;
            lit1.set(temp);


        }
        System.out.println(list);//[13, 23, 33]


    }
}
