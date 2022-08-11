package SerbestCalisma;

import java.util.Scanner;

public class Armstrong_Sayi_Bulmaca {
    public static void main(String[] args) {
         /*
       ARMSTRONG SAYI:
       Bir sayının; ayrı ayrı her bir basamağının, o sayının basamak adeti kadar üssü alınarak toplanır.
       Eğer bu toplam sonucu o sayıya eşit ise; sayı Armstrong Sayıdır.
       Örnek1;  153 Sayısı. 3 basamaklıdır. Her bir basamağının küplerinin ( 3 basamaklı olduğu için ) toplamı
       kendine eşit olduğu için ARMSTRONG sayıdır.
       (1*1*1) + (5*5*5) + (3*3*3)  ===> 1 + 125 + 27 = 153
       Örnek2: 1634 sayısı. 4 basamaklıdır. Her bir basamağının ayrı ayrı 4.kuvvetlerinin toplamı kendine eşittir.
       1634 = (1*1*1*1) + (6*6*6*6)+ (3*3*3*3) + (4*4*4*4) ==> 1634 eder.

         Soru : 1 ile 99.999 sayıları dahil;  bu aralıkta olan sayılardan Armstrong sayiları yazdıran bir java kodu yazın.
         */


        int toplamDeger=0;
        int birlerBas=0;
        int onlarBas=0;
        int yuzlerBas=0;
        int binlerBas=0;
        int onBinlerBas=0;

        String armstrogSayi="";

        for (int i = 1; i <=99999; i++) {
            if (i<10) {
                System.out.print(i+" ");
            }else if (i<100) {
                birlerBas = i % 10;
                onlarBas = i / 10;
                toplamDeger = birlerBas * birlerBas  + onlarBas * onlarBas  ;
                if (toplamDeger == i) {
                    System.out.print(toplamDeger);
                }
            } else if (i<1000) {
                birlerBas = i % 10;
                onlarBas = (i % 100)/10;
                yuzlerBas=i/100;
                toplamDeger = birlerBas * birlerBas* birlerBas  + onlarBas * onlarBas* onlarBas +   yuzlerBas*yuzlerBas*yuzlerBas  ;
                if(toplamDeger==i) {
                    System.out.print(toplamDeger+" ");
                }
          } else if (i<10000) {
                birlerBas=i%10;
                onlarBas=(i%100)/10;
                yuzlerBas=(i%1000)/100;
                binlerBas=(i%1000);
                toplamDeger = birlerBas * birlerBas* birlerBas* birlerBas  + onlarBas * onlarBas* onlarBas* onlarBas +   yuzlerBas*yuzlerBas*yuzlerBas*yuzlerBas  ;
                if(toplamDeger==i){
                    System.out.println(toplamDeger);
                }

            }

        }

    }
    }
