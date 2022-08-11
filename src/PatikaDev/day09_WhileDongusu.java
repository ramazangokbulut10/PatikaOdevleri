package PatikaDev;

import java.util.Scanner;

public class day09_WhileDongusu {
    public static void main(String[] args) {
        /*
        Döngüler,belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan programlama kodlarıdır.
        Java'da 3 tür döngü vardır, FOR , WHİLE, DO-WHİLE, Olmak üzere..
         */

        // While döngüsü ile 1'den 5'e kadar yazan bir proğram yazalım.
        /*
        int i = 1;
        int k = 5;
        System.out.println("Program başladı.");
        while (i <= 5) {
            System.out.println(i);
            i++;
            while (k <= 10) {
                System.out.println(k);
                k++;
            }
        }
        System.out.println("Program bitti.");

        int left = 100, right = 200;
        while (++left < --right) ;
        System.out.println(left);

        // While dongusunu diger dongulerden ayırtan özellik ne kadar donduruleceğini bilmediğimiz olaylarda kullanırız

        int paswoord;
        boolean isPaswoordSuccess = true;
        Scanner scan = new Scanner(System.in);

        while (isPaswoordSuccess) {
            System.out.println("Şifre giriniz.");
            paswoord = scan.nextInt();
            if (paswoord == 123) {
                System.out.println("Şifreniz doğru");
                isPaswoordSuccess = false;
            } else {
                System.out.println("Şifeniz yanlış.");
            }

            // 1'den 10'a kadar çift olan sayıları yazdırınız.
        */

        /*
        1'den 10'a kadar olan sayıları yazdırdığımız for ve while donguleri ile.

         for (int i = 1; i <=10 ; i++) {
            if (i%2 == 0) {  // Bir sayının modulus 2 ile bölümünden kalan sıfır ise o sayı çifttir.
                System.out.println(i);
            }
        }
         */
           int i=0;
           while (i<=10){
               if (i%2==0){ // Bir sayının modulus 2 ile bölümünden kalan sıfır ise o sayı çifttir.
                   System.out.println(i);
               }
               i++;
           }




    }
  }
