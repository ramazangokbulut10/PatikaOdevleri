package SerbestCalisma;

import java.util.Scanner;

public class Girilen_Kelimeyi_Ters_Yaz {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime Girin : ");
        String kelime=scan.nextLine();
        terstenYaz(kelime);

    }

    private static void terstenYaz(String kelime) {
        String tersKelime=kelime.substring(kelime.length()-1);

        for (int i =kelime.length()-2; i >=0 ; i--) {

            tersKelime+=kelime.substring(i,i+1);

        }
        System.out.println("Girilen Kelimenin Tersi : "+tersKelime);

    }

}
