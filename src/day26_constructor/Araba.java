package day26_constructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
//Herhangi bir constructor olusturdugumuzda Java default Constructoru siler
//Eger projede bir sorun oluşmasini istemiyorsak Mutlaka parametresiz default constroctor olusturmaliyiz
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){//parametresiz Constructor olusturduk

    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu arabada max "+hiz+" yapar");
    }
}


