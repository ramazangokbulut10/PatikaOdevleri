package day11_stringManipulation;

import java.util.Scanner;

public class Serbest_Calisma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //---------------------endsWith Komutuyla e-posta kontrolü-------------------------------------------

        System.out.println("e-postanızı girin(endsWith komutu ile yapılan)");
        String ePosta=scan.next().toLowerCase();
        if(ePosta.endsWith("@gmail.com")){
            System.out.println("e postanız kaydedildi");

        }else{
            System.out.println("Hatalı giriş yapıldı");
        }

        //---------------------contains Komutuyla e-posta kontrolü-------------------------------------------

        System.out.println("e postanızı girin(contains komutuyla)");
        ePosta=scan.next().toLowerCase();

        if(ePosta.contains("@gmail.com")){
            System.out.println("e postanız kaydedildi");
        }else {
            System.out.println("Hatalı giriş yapıldı");
        }

        //---------------------------------------------------------------
        String cumle="Bu gun hava cok guzel";
        int ilkKelimeIndex=cumle.indexOf("cok");
        int deneme=cumle.lastIndexOf("hava",10);
        System.out.println(deneme);



        }


}
