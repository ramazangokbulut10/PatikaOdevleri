package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBulma {
   /* Soru 3:
    iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
    each loop
    kullanarak bulunuz. Sonucu ekrana yazdiriniz.
    Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
    */
    public static void main(String[] args) {
        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsimler=new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if(each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }
            }

        }
        if (ortakIsimler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        }else {
            System.out.println("Her iki arraydeki ortak isimler :"+ortakIsimler);
        }
    }
}
