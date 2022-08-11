package SerbestCalisma;

import java.util.Scanner;

public class Method_Overloading_HesapMakinesi {
    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */
    public static int toplama(int a,int b){
        return a+b;
    }
    public static int toplama(int a,int b,int c){
        return a+b+c;
    }
    public static int carpma(int a,int b){
        return a*b;
    }
    public static int carpma(int a,int b,int c){
        return a*b*c;
    }
    public static int cikarma(int a,int b){
        return a-b;
    }
    public static double bolme(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yapilacak islemi secin : :: :");








        }
}
