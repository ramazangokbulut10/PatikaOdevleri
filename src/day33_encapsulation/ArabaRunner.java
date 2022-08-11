package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi uzerinden mark avariable'ina ulasabildim
        //degistirebildim(set) ve yazdirabildim(get)
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ina ulasimi
        //tamamen serbest yapilabilir yada tamamen engelleyebilirim

        //yani access modifier ya hep ya hic diyor

        //model'i degistirelim ama goremeyelim
        //yakiti'da gorelim ama degistiremeyelim

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim -ozel yetki tanimlayacaginiz  variable'lari private yapin
        //         private bir data 'ya baska class'lardan ulasmak mumkun olmadigindan

        //2.adim- set yetkisi icin sette, ve get yetkisi icin getter methodlari olusturalim


        arb1.setModel("Supra");// model olarak Supra'yi atadik
        //model'i yazdirma imkanimiz yok,cunku getter yok
        System.out.println(arb1.getYakit());//elektrikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter method'u yok


    }
}
