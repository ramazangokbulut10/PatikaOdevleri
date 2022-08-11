package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler={"Istanbul","Ankara","Mersin","Konya","Kastamonu","Izmir"};
        String istenmeyenHarf="a";

        List<String> kalanlar=new ArrayList<>();
        for (int i = 0; i < sehirler.length; i++) {
            if(!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }
        System.out.println(kalanlar);

        //-------------------------------------------

        String[] kalanlarArray=new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArray.length; i++) {
            kalanlarArray[i] = kalanlar.get(i);

        }
        sehirler=kalanlarArray;
        System.out.println("Sehirler arrayinin son hali : "+ Arrays.toString(sehirler));

    }
}
