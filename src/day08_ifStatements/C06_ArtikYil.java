package day08_ifStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {

        //4 ile bölünen,400 e bölünen; fakat 100 bölünmeyen, yıllar artık yıldır
        //artık yıl programı yapın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Yıl Girin :");

        int yil=scan.nextInt();
        if (yil%400==0) {
            System.out.println("Artık yıldır");

        }else if (yil%100==0) {
            System.out.println("Artık yıl değil");
        } else if (yil%4==0)
        {

            System.out.println("Artık yıldır");
        }
        else {
            System.out.println("Artık Yıl değil");
        }

    }
}
