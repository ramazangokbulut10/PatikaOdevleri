package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
//        Soru 3- Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
//        bize true veya false sonucu donen bir method olusturun.

        String[] isimler={"Basak","Nurullah","Fatih","Adem","Enes"};
       Scanner scan=new Scanner(System.in);
        System.out.println("Aranan Kelimeyi Girin : ");
        String arananIsim=scan.nextLine();

        boolean sonuc=arananIsim(arananIsim,isimler);

        System.out.println(sonuc);
    }

    public static boolean arananIsim(String arananIsim, String[] isimler) {

        boolean sonucuDondur=false;

        for (int i = 0; i < isimler.length ; i++) {
            if (arananIsim.equalsIgnoreCase(isimler[i])){
                sonucuDondur=true;
            }

        }
        return sonucuDondur;

    }


}
