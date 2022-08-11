package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

// asagidaki array'i List'e ekleyin


        Integer[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,7,0};
        List<Integer> sayilar=new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);//[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 7, 0]

// yukaridaki Array'den Liste element ekleme işlemini methodla yapilabilir

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);   //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 7, 0]

//---------------------iki sekilde olusturlan Listeyi karsilastiralim-------------------------
        sayilar.add(5);         //for la yapilan Liste yeni element ekliyebiliyoruz
        System.out.println(sayilar);

      //  sayilar2.add(5);         //methodla yapilan Liste ekleme yapilamiyor hata veriyor
       // System.out.println(sayilar2);



        arr[0]=20;//array de degisiklik yapiyoruz.0. elementi 20 olarak degistirdik
        System.out.println(Arrays.toString(arr));
        System.out.println("arrayde degisiklik yapinca sayilar2 :"+sayilar2);//Arrayde yapilan degisiklik methodla yapilan Listte de degisiklik yapiyor


    }
}
