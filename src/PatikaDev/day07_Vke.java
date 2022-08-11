package PatikaDev;

import java.util.Scanner;

public class day07_Vke {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
       Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

       Formül
       Kilo (kg) / Boy(m) * Boy(m)

        Çıktısı
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
         Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz.");
        double boy=scan.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz.");
        int kilo=scan.nextInt();
        double vke=kilo/(boy*boy);
        System.out.println("vke = " + vke);

    }
}
