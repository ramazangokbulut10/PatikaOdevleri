package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yaşını alınız, 65'ten büyük ve eşit ise emekli olabilsin, küçük ise olamasın.
        Aynı zamanda kullanıcı yaşını 0 ve 0'dan küçük değer girdiğinde, lütfen gecerli yaş giriniz yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin:");
        int yas=scan.nextInt();
        if(yas<=0){
            System.out.println("Hatalı Bir Giriş Yaptınız.");
        }
        else if (yas<65)
        {
            System.out.println("Emekli Olamazsın "+(65-yas)+" yıl daha çalışmalısın");

        }else {
            System.out.println("Emekli Olursun:");
        }
    }
}
