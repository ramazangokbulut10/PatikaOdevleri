package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /*kullanıcıdan gün numarası alın:
        1 ise pazartesi.... 7 ise pazar
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Kaçıncı gün olduğunu giriniz.");
        int gunNo=scan.nextInt();

        /*
        switch yanıya yazılan () neye göre case atayacağımızı gosterir.
        Java girilen değere göre case'i bulur o satırdan çalıştıraya başlar.
        Break yazısı görünceye ya da switch parantezine kadar devam eder.

        if - else - if ---- else yapısında oldugu gibi hicbir sarta uymayanları "default" keyword kullanılır.
         */

        switch (gunNo) { // Kullanıcıdan alınan gün neyse o rakama gider ve çalıştırır.
            case 1:
                System.out.println("Pazartesi");
                break;// break yazmazsak case 1 seçildikten sonra 1 den sona kadar hepsini yazar
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:// Eğer default oluşturmazsak case 1-7 arası girmezsek hiç bir uyarı vermez
                System.out.println("Geçerli Numara Girin");
                /*
                Switch case komutlarında , long,double,float,boolean kullanılmaz.
                 */
        }
    }
}
