package practice01.day03;

import java.util.Scanner;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        int fiyat;
        Scanner scan=new Scanner(System.in);
        System.out.println("Fiyat girin :");
        fiyat=scan.nextInt();

        String result=fiyat<10?"ucuz":fiyat<20?"normal":"pahalı";

        System.out.println("result = " + result);

    }
}
