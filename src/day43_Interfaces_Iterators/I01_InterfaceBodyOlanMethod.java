package day43_Interfaces_Iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();
    /*
    Normal bir class'da oldugumuzu dusunursek
    2 tane access modifier kullanma ihtimali olamaz.

    Asagidaki method'da goreceginiz gibi interface'de istisnai olarak
    body'si olan methodlar olusturulabilir.
    Bu ozellik Java 8 'en sonra kullanilmaya baslamistir.
    Bir interface'e yeni bir method eklememiz
    gerektiginde eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    Bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme mecburiyeti olmaz
    Ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan genel
    kurallari bozmaz
    Bu methodlarin body'si olsa da bunlara concrete method denmez ama
    override edilme mecburiyeti yoktur
    Burada ki default kelimesi access modifier degil
    istisnai durumu belirtilmesi icindir

    O zaman nicin 2 keyword (yani static ve default )tanimlanmistir?
    Bu 2 farkli kelimenin amaci child class'lardan bu method'a nasil erisileceginin belirlemek icindir
    static kullanilirsa child class'lardan bu method'a erismek icin
    InterfaceAdi.methoAdi yeterli olur

    default keyword kullanilirsa method'a erismek icin obje olusturulmalidir.



     */
    public default void  teker(){
        System.out.println("default.....Tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("static.......Tum arabalarin direksiyonu vardir");
    }
    static void lamba(){
        System.out.println("Public yok static var");

    }
    default void far(){
        System.out.println("Public yok default var");

    }



}
