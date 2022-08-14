package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin:");
        char harf=scan.next().charAt(0);  // scan.nextchar olmadıgı icin "scan.next.charAt(0);" bu şekilde alıyoruz.

        if((harf>='a' && harf<='z')||(harf>='A' && harf<='Z'))
        {
            System.out.println("Girilen Karakter Harf");
        }else
        {
            System.out.println("Girilen Karakter harf DEĞİLLLL!!!!");
        }
    }
}
