package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreation {
    public static void main(String[] args) {
        //kullanıcıdan şehir ismini ve doğum tarihini alıp
        //bunları programda kullanacagımız formatta bize döndüren bir method oluşturun
        //Şehir ismini programımızda büyük harf olarak,
        //tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("Girdiğiniz Şehir :"+sehir);
        System.out.println("Girdiğiniz tarih :"+tarih);
    }
    public static String tarihAl() {
        String tarih = null;
        Scanner scan=new Scanner(System.in);
        System.out.println("Yıl gir : ");
        int yil=scan.nextInt();
        if (yil<1900&&yil>2100){

            System.out.println("Yıl için geçerli bir sayı yazmalısınız(1900-2100)");
        }else {
            tarih=yil+"-";
        }
        System.out.println("Kaçıncı ay olduğunu tam sayı olarak yazınız");
        int ay=scan.nextInt();
        if(ay<=0||ay>12){
            System.out.println("Ay no 1-12 arasında olmalıdır");
        }else if(ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("Ayın kaçıncı günü olduğunu tam sayı olarak girin");
        int gun=scan.nextInt();
        if(gun<=0||gun>31){
            System.out.println("1-31 arası giriş yapın");
        } else if (gun<10) {
            tarih = tarih + "0" + gun;
        }else {tarih=tarih+gun;}
        return tarih;
    }
    public static String sehirAl() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sehir adi girin : ");
        String sehirAdi=scan.next().toUpperCase();
        return sehirAdi;
    }
}
