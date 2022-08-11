package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove_Integer {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<Integer>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);
        System.out.println("Tum Liste:"+sayilar1);

        sayilar1.remove(1);
        System.out.println("1 i sil dedikten sonra:"+sayilar1);//1. indextekini siler
        //sayilardan olusan List'teki elmenti silmek istedigimizde direk yazarsak index olarak algilar yanlis elementi siler



        //silinecek elemeti Listte dogru bulabilmek icin 2 yontem uygulariz:

        //1.yontem silinecek elementi variable'ye assign ederek, o variableyi remove koduna yazariz
        Integer sil=5;//silinecek objeyi obje olarak tanimlariz
        sayilar1.remove(sil);//daha sonra remove komutunda yazinca direk o objenin oldugu degeri siler
        System.out.println(sayilar1);

        //2.yontem indexof'unu bulup oradan sileriz
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);

    }
}
