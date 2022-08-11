package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati));//90,0
        System.out.println(satisFiyati);//100,0
        //NOT= Java "Pass By Value" 'dir. Primitive bir datayi parametre olarak bir methoda gonderdigimizde Java orjinal
        //variable yerine ayni degere sahip kopya bir variable olusturur ve method icerisinde kopya variable uzerinden islem yapilir.
    }
    public static double indirimliFiyat(double orjinalFiyat){

        return orjinalFiyat*0.9;
    }

}
