package day27_staticKeyword;

public class C01 {
    static  int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        static variable=class variable
        instance variable=obje variable
         */

        System.out.println(sayi);//static varible yi static class ta direk cagirabiliriz

        C01 obje1=new C01();
        System.out.println(obje1.rakam);//static olmayan variableyi obje olusturup cagirabiliriz
        System.out.println(obje1.sayi);//static variableyi obje ile de cagirabiliriz

        obje1.rakam+=1;
        sayi+=1;
        System.out.println("1 arttirdiktan sonra rakam: "+obje1.rakam);//6
        System.out.println("1 arttirdiktan sonra sayi(ins): "+sayi);//11

        System.out.println("---------------------------------------------");

        C01 obje2=new C01();
        System.out.println("1 arttirdiktan sonra rakam: "+obje2.rakam);//5 intance variablenin takibi objenin olusturulmasindan sonra baslar
        System.out.println("1 arttirdiktan sonra sayi(ins): "+obje2.sayi);//11 static variable olugundan dolayi butun classta ki degisikler ilgilendirir

        System.out.println("---------------------------------------------");

        obje2.rakam++;
        obje2.sayi++;

        System.out.println("1 arttirdiktan sonra rakam: "+obje2.rakam);//6
        System.out.println("1 arttirdiktan sonra sayi(ins): "+obje2.sayi);//12


    }
}
