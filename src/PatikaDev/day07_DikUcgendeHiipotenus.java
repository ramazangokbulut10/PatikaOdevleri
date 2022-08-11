package PatikaDev;

import java.util.Scanner;

public class day07_DikUcgendeHiipotenus {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
       Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
         Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

         Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

         */


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen birinci kenarı giriniz.");
        int a=scan.nextInt();
        System.out.print("Lütfen ikinci kenarı giriniz.");
        int b=scan.nextInt();
        double c=Math.sqrt((a*a)+(b*b)); // sayının karekökünü almaya yarıyor. Math.sqrt
        System.out.println("c = " + c);



    }
}
