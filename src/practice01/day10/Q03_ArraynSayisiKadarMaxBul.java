package practice01.day10;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArraynSayisiKadarMaxBul {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int[]arr={1,2,3,4,5,6,102,7,8,102};
        int n=5;
        int count=1;

        List<Integer> list=new ArrayList<>();

        for (int each:arr) {
            list.add(each);
        }
        List<Integer> maxList=new ArrayList<>();
        while (count<=n){
            int max= list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)>max && !(maxList.contains(list.get(i)))){
                    max=list.get(i);
                }
            }
            maxList.add(max);
            count++;
        }
        System.out.println("Array'in max "+n+" elemani "+maxList);
    }
}
