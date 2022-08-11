package practice01.day05;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Adınızı Soyadınızı Girin : ");
        String firstName=scan.nextLine(),lastName=scan.nextLine();


        String fullName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("FullName : "+fullName);

    }
    }
