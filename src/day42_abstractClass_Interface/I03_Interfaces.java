package day42_abstractClass_Interface;

public interface I03_Interfaces {
    /*int sayi;---> Interface'lerde tum variable'lar public static ve final'dir
    Dolayisiyla sonradan deger atama sansimiz yoktur
    Bunun icin variable olusturdugumuz da mutlaka deger atamaliyiz

    Bir interface bir class'i parent edinemez

     */
    int SAYI=20;
     void ses();
    void yakit();
    /*
    Interface icerisindeki her method
    public abstract ve static ozelliklere sahiptir

    abstract bir method'un body'si olmasi mumkun  degildir
    Java update ile-->



     */

    static void ekleme(){
        System.out.println("sonradan eklenen method");
    }
    /*
    Interface'de sonradan method eklemek icin static keyword'u kullanilarak
    bunu yapabiliriz.Fakat Interface'in child'larinin bu method'u
     override etmek zorunda degildir.Bu method'larin body'si
     olsa da concerete degillerdir(istisna)
     */



}
