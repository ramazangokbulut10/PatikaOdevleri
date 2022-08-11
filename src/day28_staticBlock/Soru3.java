package day28_staticBlock;

import java.awt.*;
import java.util.ArrayList;

public class Soru3 {
    //Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method list elemanlarini arttirmayi deneyelim
    //1-Method'da elemanlari for each loop kullanarak arttirin
    //2-Method'da elemanlari set methodu kullanarak arttirin
    //3-Methodlari arka arkaya cagirip artislari kalici olup olmasiklarini kotrol edelim
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        degistir(list);
        System.out.println(list);
        degistir(list);
        System.out.println(list);
    }

    private static void degistir(ArrayList<Integer> list) {
        for (int each:list) {
            each+=3;
            System.out.println(each+" ");
           }
        System.out.println();
        System.out.println(list);
    }
    public static void degistir2(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+3);
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
    }
}
