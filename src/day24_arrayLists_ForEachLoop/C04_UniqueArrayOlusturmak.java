package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturmak {
    public static void main(String[] args) {

        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};
        int[] uniqueArray=methodlaTekarEdenleriSilinmisArray(arr);
        System.out.println(Arrays.toString(uniqueArray));

    }
    private static int[] methodlaTekarEdenleriSilinmisArray(int[] arr) {

        List<Integer> tekrarsizList=new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1] &&!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }
        }
        int[] tekrarsizArray=new int[tekrarsizList.size()];
        for (int i = 0; i <tekrarsizList.size(); i++) {
            tekrarsizArray[i]=tekrarsizList.get(i);
        }
        return tekrarsizArray;
    }
    }


