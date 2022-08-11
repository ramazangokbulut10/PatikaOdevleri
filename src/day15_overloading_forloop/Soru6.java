package day15_overloading_forloop;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {

        //kullanıcıdan 100 den kucuk bir tam sayı isteyin
        //1 den baslayarak girilen sayıya kadar tum sayıları yazdırın
        //ANCAK; -Sayı 3 ün katı ise "Java" yazdırın
        //        -Sayı 5 in katıysa sayı yerine "Guzeldir" yazdırın
        //      - Hem 3 hem 5 in katıysa "Java Güzeldir" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("100 dan kucuk bir tam sayı girin : ");
        int sayi=scan.nextInt();
        if(sayi<100&&sayi>0){
            for (int i=1;i<=sayi;i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Java Güzeldir");
                }
                 else if (i%5==0) {
                    System.out.println("Güzeldir");
                } else if(i%3==0){
                    System.out.println("Java");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
