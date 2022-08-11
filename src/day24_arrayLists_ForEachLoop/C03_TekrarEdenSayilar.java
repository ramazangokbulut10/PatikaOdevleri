package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        String [] arr={"Mustafa","Ali","Veli","Mustafa","Mahmut","Ali","Mustafa"};
        String tekrar="";
        String yazdir="";


        for (int i = 0; i < arr.length ; i++) {
            tekrar=arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if (tekrar.equals(arr[j])&&!yazdir.contains(tekrar)) {
                    yazdir+=tekrar+" ";
                }
            }

        }
        System.out.println("1.cozum"+yazdir);
        //hocanin yaptiği cözüm

        int []sayilar={2,3,6,3,4,1,9,6,3,5,5};
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));

        List<Integer> tekrarEdenler=new ArrayList<>();//hoca tekrar edenleri liste yazdirmak istedigi icin bunu tanimladi

        for (int i = 0; i < sayilar.length-1 ; i++) {
            if ( sayilar[i]==sayilar[i+1] && !tekrarEdenler.contains(sayilar[i]))
            {
                tekrarEdenler.add(sayilar[i]);
            }

        }
        System.out.println("Tekrar edenler Listle :"+tekrarEdenler);

    }
}
