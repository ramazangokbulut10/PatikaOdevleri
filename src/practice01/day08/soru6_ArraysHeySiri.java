package practice01.day08;

import java.util.Arrays;

public class soru6_ArraysHeySiri {
    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */
    public static void main(String[] args) {
        String str = "HeySiri";
        str=str.replace("Hey", "Bye");
        System.out.println(str);
        String[] arr=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));


    }
}
