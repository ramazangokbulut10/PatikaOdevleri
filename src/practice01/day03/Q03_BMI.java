package practice01.day03;

import java.util.Scanner;

public class Q03_BMI {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu girin");
        double kilo=scan.nextDouble();
        System.out.println("Boyunuzu girin");
        double boy=scan.nextDouble();
        boy/=100;//boy=boy/100
        System.out.println("Kilonuz : "+kilo);
        System.out.println("Boyunuz : "+boy);
        System.out.println("Kitle Indeksiniz : "+(kilo/(boy*boy)));
    }
}
