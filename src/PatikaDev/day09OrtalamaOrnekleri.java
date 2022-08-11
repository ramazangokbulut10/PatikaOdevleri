package PatikaDev;

import java.util.Scanner;

public class day09OrtalamaOrnekleri {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);
        int total = 0;
        int dersSayisi = 0;
        int dersNotu;

        //Matematik
        System.out.println("Matematik:");
        dersNotu = input.nextInt();
        if(dersNotu >= 0 && dersNotu <= 100) {
            total += dersNotu;
            dersSayisi++;
        }
        //Türkçe
        System.out.println("Türkçe:");
        dersNotu = input.nextInt();
        if(dersNotu >= 0 && dersNotu <= 100) {
            total += dersNotu;
            dersSayisi++;
        }

        double ortalama = total/dersSayisi;
        System.out.println("ortalama = " + ortalama);


    }
}

