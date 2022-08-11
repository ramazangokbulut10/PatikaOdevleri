package day18_while_doWhileLoop;

import java.util.Scanner;

public class While_PozitifSayTopla {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif sayi Girin :");
        int sayi=scan.nextInt();
        int toplam=0;
        int negatifSayilar=0;
        int pozitifSayilar=0;

        while (sayi!=0) {
            if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz : ");
                negatifSayilar++;

                System.out.println("Pozitif sayi Girin :");
                sayi=scan.nextInt();
            } else  {
                toplam+=sayi;
                pozitifSayilar++;

                System.out.println("Pozitif sayi Girin :");
                sayi=scan.nextInt();

            }

        }
        System.out.println("Pozitif Girilen Sayi Sayisi : "+pozitifSayilar);
        System.out.println("Negatif Girilen Sayi Sayisi : "+negatifSayilar);
        System.out.println("Pozitif Sayilarin Toplami : "+toplam);

    }
}
