package practice01.day06;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cm degerini girin : ");
        double santiMeterValue=scan.nextDouble();
        convertSM(santiMeterValue);


    }

    private static void convertSM(double santiMetre){
        double meter=santiMetre/100;
        double kMeter=santiMetre/100000;

        System.out.println("Metre : "+meter+"\n"+"Kilometre : "+kMeter);
    }



}
