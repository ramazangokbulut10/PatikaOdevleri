package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        //%25 indirimli fiyat hesaplayip bize donduren bir method olusturun

       double satisFiyati=100;
       double indirimOrani=60;
       double indirmliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat : "+indirmliFiyat);
    }
    private static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {
        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);
        return indirimliFiyat;

        //NOT= Java "Pass By Value" 'dir. Primitive bir datayi parametre olarak bir methoda gonderdigimizde Java orjinal
        //variable yerine ayni degere sahip kopya bir variable olusturur ve method icerisinde kopya variable uzerinden islem yapilir.
    }
}
