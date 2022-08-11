package practice01.Serbest_Calisma;

import java.util.Scanner;

public class VeriyiYildizYapma {
    public static void main(String[] args) {
        /*
		 Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
		 ve asagidaki gibi yazdirin
		 isim-soyisim : M***** B*******
		 kart no : **** **** **** 1234
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi girin : ");
        String isim=scan.nextLine();
        System.out.println("Soy isminizi girin : ");
        String soyisim=scan.nextLine();
        System.out.println("Kredi Kartı numaranızı girin : ");
        String krediKartNo=scan.nextLine();

        System.out.println("Ad-Soyad : "+
                            isim.substring(0,1)+isim.substring(1,isim.length()).replaceAll("\\w","*")+" "+
                            soyisim.substring(0,1)+soyisim.substring(1,soyisim.length()).replaceAll("\\w","*"));
        System.out.println("Kredi Kartı No : "+krediKartNo.substring(0,1)+krediKartNo.substring(1,krediKartNo.length()).replaceAll("\\d","*"));

    }
}
