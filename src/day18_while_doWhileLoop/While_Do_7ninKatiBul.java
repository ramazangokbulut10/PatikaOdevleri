package day18_while_doWhileLoop;

import java.util.Scanner;

public class While_Do_7ninKatiBul {
    public static void main(String[] args) {
        //Girilen iki sayi arasi ndaki sayilarin 7nin kati olanlarini yaz..

        Scanner scan=new Scanner(System.in);
        System.out.println("Basnlangic ve bitis degerlerini girin :");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();
        int temp=baslangic;

        while(temp<bitis){
            if (temp%7==0){
                System.out.print(temp+" ");
                temp++;
            }else {temp++;}

        }

        temp=baslangic;
        System.out.println("");
        do {
            if (temp%7==0){
                System.out.print(temp+" ");
                temp++;
            }else {temp++;}

        }while (temp<bitis);
    }
}
