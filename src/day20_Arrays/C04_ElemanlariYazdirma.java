package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayi[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(sayi));


        for (int i = 0; i <= sayi.length-1 ; i++) {
            System.out.print(sayi[i]+" ");
        }


    }
}
