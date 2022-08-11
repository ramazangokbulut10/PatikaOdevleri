package day24_arrayLists_ForEachLoop.sorulaar;

import java.util.ArrayList;
import java.util.List;

public class Q2ListdekilerinKareToplamlariniYaz {

    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        int karesi=1;
        int topla=0;

    for (int each:liste) {
        karesi=each*each;
        topla+=karesi;
    }
      System.out.println(topla);
    }
}
