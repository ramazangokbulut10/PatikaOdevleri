package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        //primitive data turlerini kabul etmez o yuzden wrapper clas olarak Integer diye gireriz
        List<Integer> sayilar=new ArrayList<>();

        //List elemanlarini tek tek eklemek zorunyiz...
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);

        sayilar.add(2,10);
        System.out.println(sayilar);


        List<String> isimler=new ArrayList<String>();
        System.out.println(isimler);
        isimler.add(0,"Mustafa");
        isimler.add(1,"Abdullah");
        isimler.add(2,"Mahmut");
        System.out.println(isimler);

    }
}
