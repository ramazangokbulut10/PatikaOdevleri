package SerbestCalisma;

import java.util.ArrayList;
import java.util.List;

public class Arrayde7VarMi {
    public static void main(String[] args) {
        int[] arr={2,6,4,5,87};
        yediVarMi(arr);
    }

    private static void yediVarMi(int[] arr) {
        int basamak=0;
        int kontrol=0;
       // List<Integer> liste=new ArrayList<>();
        for (Integer each:arr) {
            while (each!=0){
                basamak=each%10;
                each/=10;
                if(basamak==7){
                    kontrol++;
                }
            }
        }
        if (kontrol==0){
            System.out.println("dizide 7 rakami yok");
        }else {
            System.out.println("BOOM!");
        }
    }
}
