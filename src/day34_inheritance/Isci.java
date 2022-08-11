package day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri class'i
    kendilerine parent edinirler.

    Mesala isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel classs'indaki tum variable ve method'lara ihtiyaci oldugunu
    gore biliriz.Bu durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz

    Bir class'i parent edinmek icin extends keyword kullaniriz

    bir class baska bir class'i parent edidiginde
    1- parent class'daki tum ozelliklere(variable+method) otomatik olarak sahip olur
    2- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'da olmayan bazi yeni ozellikler olusturabilir
    Not:Parent class'daki  ozelliklerden hic birini reddedemez ama degistirebilir
     */
    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();

        System.out.println(isci1.isim);//Isim belirtilmedi
        //kendi class'imizda isim variable'i yok onun icin parent;'a gideriz
        isci1.isim = "Selim";
        System.out.println(isci1.persNo);//1001-->>kendi class'imizda varsa onu kullaniriz

        isci1.maas();


    }

    public void maas() {
        System.out.println("Isciler minumum 15 euro saat ucreti alir");//Isciler minumum 15 euro saat ucreti alir
    }

    public void ozelSigorta() {
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }


}
