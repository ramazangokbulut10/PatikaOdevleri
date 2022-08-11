package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu","Izmir"};
        String istenmeyenHarf="s";
        List<String> silinmisler=new ArrayList<String>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                silinmisler.add(sehirler[i]);
            }
        }
        System.out.println(silinmisler);

   }
}
