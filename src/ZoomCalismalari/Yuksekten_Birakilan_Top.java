package ZoomCalismalari;

import java.util.Scanner;

public class Yuksekten_Birakilan_Top {
    public static void main(String[] args) {

        /*
   SORU2 : Bir top belirli bir yukseklikten bırakılmaktadır.
   Bırakıldıktan  sonra, bırakıldığı yuksekligin 3/4'ü kadar yerden yukari doğru ziplamaktadir
   Top; ziplama yuksekligi 1 metrenin altina indiginde durmaktaadir
   Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan kodları do - while ile çözünüz
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Topun ilk yüksekliğini gir : ");
        double h=scan.nextDouble();
        int sayac=1;
        double yol=2*h;
        do {
            h=h*3/4;
            yol+=2*h;

            if(h>1) {
                sayac++;
                System.out.println("h degeri : " + h + "\n" + "yol degeri : " + yol);
                System.out.println("Yere vurma sayisi : " + sayac);
            }
        }while (h>1);

    }
}
