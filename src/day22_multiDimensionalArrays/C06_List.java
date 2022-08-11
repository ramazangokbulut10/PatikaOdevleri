package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<String>();
        System.out.println(isimler);        //  []

        //List<int> sayilar=new ArrayList<int>();

        isimler.add("Mustafa");
        System.out.println(isimler);    //[Mustafa]

        System.out.println(isimler.add("Ayse"));//true doner

        System.out.println(isimler);    // [Mustafa, Ayse]



    }
}
