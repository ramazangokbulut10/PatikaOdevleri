package day37_overridding;

public class FSupra extends EToyota {

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez
        Eger child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overridding method OLMAZ

         */
    }

    @Override
    void motor() {
       /*
        @Override notasyonu java'ya bir gorev verir
        Java ,bu notasyonla birbirine bagli olan bu 2 method'u surekli kontrol eder
        Eger parent class'daki overridding method'u silerseniz CTE verir

        @Override  notasyonu kullanmak mecburi degildir
        Eger  @Overridding method silinirse kodun CTE vermesini istersek
        override notasyonu kullanmaliyiz
        */
    }

}
