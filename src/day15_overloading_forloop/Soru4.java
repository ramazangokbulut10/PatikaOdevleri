package day15_overloading_forloop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //KUllanıcıdan 10 den kucuk bir tam sayı isteyin
        //1 den baslayarak 3 un katı olan sayıları yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir tam sayı girin : ");
        int sayi=scan.nextInt();

        if(sayi<=0||sayi>100){
            System.out.println("Yanlış giriş yaptınız!!!");
        }else {
            for(int i=1;i<=sayi;i++){
                if (i%3==0){
                    System.out.println(i);
                }
            }
        }


    }
}
