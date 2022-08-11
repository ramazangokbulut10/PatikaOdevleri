package day15_overloading_forloop;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
    //kullanıcıdan 100 den kucuk bir tamsayı isteyin
        //1 den baslayarak 3 ve 5 in katı sayıları yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("100 den küçük pozitif tam sayı girin");
        int sayi=scan.nextInt();

        if (sayi<=0||sayi>100)
        {
            System.out.println("Hatalı giriş yaptınız : ");
        }else {
            for (int i = 1; i <sayi ; i++) {
                if (i%3==0||i%5==0) {
                    System.out.println( i);
                }

            }

        }




    }
}
