package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int sayi=0;

                            //while loop
//while loop da ilk sayi variable yi kontrol eder ve true ise body yi isleme sokar
        while (sayi%2==0) {

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0) {
                System.out.println("Girilen sayi cift :"+sayi);
            }else System.out.println("Tek Sayi girdin; Program KAPATILIYOR...");

        }

                        //do while loop

        //do while loop'da varibleye hiç bakmaz işlemi yapar sonra şarti kontrol eder
        // eğer true ise devam eder false ise bitirir

                sayi=1;
        do{
            System.out.println("Lutfen bir sayi giriniz(do ile)");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }while(sayi%2==0);


    }


}
