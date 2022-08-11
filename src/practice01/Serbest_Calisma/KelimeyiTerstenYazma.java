package practice01.Serbest_Calisma;

import java.util.Scanner;

public class KelimeyiTerstenYazma {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli kelime girin");
        String kelime=scan.next();

        System.out.println(kelime.substring(3).concat(kelime.substring(2,3)).concat(kelime.substring(1,2)).concat(kelime.substring(0,1)));



    }
}
