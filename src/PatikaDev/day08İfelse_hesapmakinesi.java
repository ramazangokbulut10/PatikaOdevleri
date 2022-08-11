package PatikaDev;

import java.util.Scanner;

public class day08İfelse_hesapmakinesi {
    public static void main(String[] args) {
        // Hesap makinesi

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz.");
        int n1=scan.nextInt();
        System.out.println("Lütfen bir pozitif tam sayı giriniz.");
        int n2=scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4*Bölme");
        System.out.println("Seçiminiz");
        int isaretSecimi=scan.nextInt();

        switch(isaretSecimi) {
            case 1:
                System.out.println("Toplamanın sonucu :"+ (n1+n2) );
                break;
                case 2:
                    System.out.println("Çıkarmanın sonucu:"+ (n1-n2));
                    break;
                    case 3:
                        System.out.println("Çarpmanın sonucu = " + (n1*n2));
                        break;
                        case 4:
                            System.out.println("Bölmenin sonucu:"+ (n1/n2));
            default:
                System.out.println("Lütfen gecerli bir değer giriniz.");





        }


    }
}
