package practice01.day03;

import java.util.Scanner;

public class Q02_YolHizZaman {
    public static void main(String[] args) {

        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafeyi girin(km)");
        double yol=scan.nextDouble();
        System.out.println("Hızınızı girin(km/sa)");
        double hiz=scan.nextDouble();

        System.out.println("Mesafe : "+yol+" Km");
        System.out.println("Hız : "+hiz+" Km/sa");
        System.out.println("Süre : "+(yol/hiz)+" saat");

    }
}
