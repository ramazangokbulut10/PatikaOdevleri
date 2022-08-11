package practice01.day04;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {

        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinde yazın : ");
       double boy=scan.nextDouble();
        System.out.println("Kilonuzu girin : ");
        int kilo=scan.nextInt();
        double bmi=kilo/(boy*boy);
        if(bmi<=20){
            System.out.println("Oldukça zayıfsınız");
        }else if(bmi>20 || bmi<=25){
            System.out.println("Normal Sınırlardasınız");
        }else if(bmi>25||bmi<=30){
            System.out.println("Şişman katagoridesiniz");
        } else if (bmi<30) {
            System.out.println("Obezzzzz");

        }

    }
}
