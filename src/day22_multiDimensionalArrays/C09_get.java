package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);


        List<String> isimler=new ArrayList<String>();
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Hayriye");

        System.out.println(isimler.get(2));//Hayriye
        System.out.println(sayilar1.get(2));//2
    }
}
