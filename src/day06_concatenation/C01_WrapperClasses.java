package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str="Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;
        // boolean primitive olduğundan hazır method gelmiyor

        Boolean buGuzelMi=true;
        buGuzelMi.toString();
//-------------------------------------------------------------------------------------------------
        System.out.println(Short.MIN_VALUE);//short un min alacağı değer
        System.out.println(Short.MAX_VALUE);//short un max alacağı değer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
//-------------------------------------------------------------------------------------------------
        //kullanıcıdan şifre iste

        Scanner scan=new Scanner(System.in);
        System.out.println("5 basamaklı bir şifre girin");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("Girilen şifre: "+sifre);
        System.out.println("Integer sifre: "+sifreSayi);

        //tamamen sayılardan oluşan bir String variable yi integer e çevirme
    }
}
