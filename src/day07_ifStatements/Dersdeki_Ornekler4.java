package day07_ifStatements;

import java.util.Scanner;

public class Dersdeki_Ornekler4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kenarını girin");
        int birinciKenar=scan.nextInt();
        System.out.println("İkinci kenarı girin");
        int ikinciKenar=scan.nextInt();
        if (birinciKenar==ikinciKenar)
        {
            System.out.println("Girilen Şekil Karedir");
        }
        else {
            System.out.println("Kare Değildir, DİKDÖRTGENDİR.");
        }


    }
}
