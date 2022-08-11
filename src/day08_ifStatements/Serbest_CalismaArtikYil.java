package day08_ifStatements;

import java.util.Scanner;

public class Serbest_CalismaArtikYil {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Yıl Girin :");

        int yil=scan.nextInt();

        if ((yil%4==0)&&(yil%100!=0))
        {
            System.out.println("Artık yıldır");
        }//else if  {
            //System.out.println("Artık yıldır");
       // }
        else if (yil%400==0) {
            System.out.println("Artık yıldır");

        }else {
            System.out.println("Artık Yıl değil");
        }
    }
}
