package day24_arrayLists_ForEachLoop.sorulaar;

public class Q1_ArrIcindekilerCarpForeach {
    public static void main(String[] args) {
        //array içindekileri for each loop ile carpma

        int [] sayi={1,2,3,4,5};
        int carpim=1;

        for (int each:sayi) {

            carpim*= each;
        }
        System.out.println(carpim);
    }
}
