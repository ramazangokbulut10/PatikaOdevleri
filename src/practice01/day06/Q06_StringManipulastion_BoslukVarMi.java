package practice01.day06;

import java.util.Scanner;

public class Q06_StringManipulastion_BoslukVarMi {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Metin giriniz : ");
        String str=scan.nextLine();
        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equals(" ")) {
                sayac++;

            }

        }
        System.out.println("Girilen metinde "+sayac+" adet bosluk var");


    }
}
