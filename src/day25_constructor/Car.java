package day25_constructor;

public class Car {
    //bu class bizim kaliphanemiz
    //bir arabada olusturmak icin ihtiyacimiz olan variable ve method'lari bu class'ta belirleriz

    //sonra farkli class'larda araba olusturmamiz gerekirse bu class'dan bir pbje olusturup,
    // burada belirlenen variable ve methodlara gore uretir
   public String marka="Marka belirtilmedi";
   public String model="Model belirtilmedi";
   public int yil;
   public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu arabada max "+hiz+" yapar");
    }
}
