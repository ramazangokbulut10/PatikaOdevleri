package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen bir gün girin");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi") ){
            System.out.println("Paz");
        }else if (gun.equals("salI")){
            System.out.println("Sal");
        }else if (gun.equals("çarşamba")){
            System.out.println("Çar");
        }else if (gun.equals("perşembe")){
            System.out.println("Per");
        }else if (gun.equals("cuma")){
            System.out.println("Cum");
        }else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        }else if (gun.equals("pazar")){
            System.out.println("paz");
        }else {
            System.out.println("Hatalı giriş");
        }


        }

    }

