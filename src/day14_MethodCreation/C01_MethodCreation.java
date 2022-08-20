package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        /*
        MethodCall demek "intellijiye" methodu createmethod yaptırmaktır.
         */
        terstenYazdir("Aley"); // yelA  Çıktısı alırız.
        C04_MethodCreation.topla(8,2);//day13-C04 deki methodu çalıştırdık

    }
    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println("Verilen Kelimenin Tersten Yazılışı : "+tersInput);
    }
}
