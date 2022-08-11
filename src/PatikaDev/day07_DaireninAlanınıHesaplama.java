package PatikaDev;

import java.util.Scanner;

public class day07_DaireninAlanınıHesaplama {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
     Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

     Alan Formülü : π * r * r;

      Çevre Formülü : 2 * π * r;

      Ödev
      Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

      𝜋 sayısını = 3.14 alınız.

       Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dairenin yarı çapını giriniz.");
        double yarıCap=scan.nextDouble();
        double pi=3.14;
        double alan=pi*(yarıCap*yarıCap);
        double cevre=2*(pi*yarıCap);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);





    }
}
