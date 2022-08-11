package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        //100 den küçük bir tam sayı isteyin
        //1 den başlayarak girilen sayıya kadar tüm sayıları yazdırın;
        //3 ün katı ise sayı yerine "Java" yazdırın.
        //5 in katı ise sayı yerine "Güzeldir" yazdırın
        //Sayı hem5 i hem 3 ün katıysa "Java Güzeldir" yazdırın.

        Scanner scan =new Scanner(System.in);
        System.out.println("100 den kucuk sayi girin : ");
        int sayi=scan.nextInt();

      if(sayi<100){
          for(int i=1;i<=sayi;i++){
              if(i%3==0&&i%5==0) {
                  System.out.println("Java Guzeldir.");
              } else if (i%3==0) {
                  System.out.println("Java");
              } else if (i%5==0) {
                  System.out.println("Guzeldir.");
              }else System.out.println(i);
          }
      }else {
          System.out.println("100 den kucuk sayi girin");
      }

    }
}
