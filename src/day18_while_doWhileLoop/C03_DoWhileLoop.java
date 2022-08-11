package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop da once kontrol edip sonra islem yaptiğiniz için islem
         */

        int sayi=7;

        while (sayi<10){
            System.out.print(sayi);
            sayi++;
        }
        System.out.println(" ");
//---------------------------------------------------------------------------------------------------------
        sayi=7;
        do {
            System.out.print(sayi);//hiç bir şarta girmeden 7 yi yazar sonra sayi++ ile bir attirir,
            sayi++;                 //while ile şarti kontrol eder
        }while (sayi<10);
    }
}
