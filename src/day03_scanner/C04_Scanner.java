package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini isteyin
        //girilen ismi
        //isminiz:Mustafa şeklinde yazdırın

        //insanların dünyasından kodlarınızın bulundugu class a dege almak için
        //Scanner class ini kullanırız

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi girin:");
        //kullanıcıdan alınan veriyi aşağıdaki gibi çağırırız.
        String kullaniciIsmi=scan.next();

        System.out.println("İsminiz: "+kullaniciIsmi);
        //System.out.println(scan.nextLine()); girilen ifadeyi boşluk gözetmeksizin hepsini alır
    }

}
