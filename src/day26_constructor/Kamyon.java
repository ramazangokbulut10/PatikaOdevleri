package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";

    public int yil;
    public int fiyat;
    public  Kamyon(String marka, String model, int yil, int fiyat){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        temel amac:KamyonRunner'da argument olarak girilen degerin
        Kamyon class'inda instance variabler'a atamasi
        Ancak scope konusunda ogrendigimiz gibi Kamyon constructor
        scope'unda marka oldugu icin instance marka'ya gitmiyor

        BU karisikligi gidermek icin instance variable leri belirli hale
        getirmemiz lazim
        Java Bunu icin 'this' keyword'u olusturmustur.
         */
    }
    public Kamyon(){//default constructor
        this("Man", "Model Bilmiyorum");//constructor in icinde 1 tane constructor call olur
        //this("Man", "Model Bilmiyorum");

    }
    public Kamyon(String marka, String model) {//kamyon4 objesine yapilan contractor
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return  "\n marka='" + marka + '\'' +
                "\n model='" + model + '\'' +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat;
    }


}
