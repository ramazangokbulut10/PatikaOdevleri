package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir gun onceki Car Class'ından obje olusturalim
        Car car1=new Car();
        System.out.println(car1.fiyat);//Farkli bir packagedeki bir classdan obje olusturdugumuzda access modifierlari dikkate almaliyiz(public yazilmali variablenin basina)

        Araba araba1=new Araba();//default constructoru kullanarak olusturulan obje
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("\nMarka : "+araba1.marka +"\nModel : "+araba1.model
                +"\nYil :"+ araba1.yil+"\nFiyat :"+araba1.fiyat);
        System.out.println(" ");
  //--------------------------------------------------------------------------------------

        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Marka : "+araba2.marka +"\nModel : "+araba2.model
                +"\nYil :"+ araba2.yil+"\nFiyat :"+araba2.fiyat);
        System.out.println(" ");
//-------------------------------------------------------------------------------------------------------
        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Marka : "+araba3.marka +"\nModel : "+araba3.model
                +"\nYil :"+ araba3.yil+"\nFiyat :"+araba3.fiyat);
        System.out.println(" ");
    }
}
