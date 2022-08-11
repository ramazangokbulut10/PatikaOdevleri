package day24_arrayLists_ForEachLoop.sorulaar;

import java.util.Arrays;

public class Q4StrdekinleriCharakterleriYaz {
    public static void main(String[] args) {

        String str="Mustafa SAK";
        String[] arr=str.split("");

        for (String each:arr) {
            System.out.print(each+"   ");

        }
    }
}
