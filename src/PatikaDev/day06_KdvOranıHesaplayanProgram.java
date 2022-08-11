package PatikaDev;

import java.util.Scanner;

public class day06_KdvOranıHesaplayanProgram {
    public static void main(String[] args) {
        /*
        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;
        */

        double tutar,kdvoranı=0.18, kdvTutar,kdvliTutar;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen tutarını giriniz.");
        tutar=scan.nextDouble();
        kdvTutar=tutar*kdvoranı;
        kdvliTutar=tutar+kdvTutar;
        System.out.println(tutar);
        System.out.println(kdvoranı);
        System.out.println(kdvTutar);
        System.out.println(kdvliTutar);



    }
}
