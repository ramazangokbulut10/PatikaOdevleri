package day28_staticBlock;

public class Soru2_IndirimSorusu {
    public static void main(String[] args) {
        //verilen bir fiyat icin %10,%20,%25 indirim yapan uc method olusturun
        //-Method'da indirim uygulayip fiyati main method'da yazdirin
        //-Method'lari arka arkaya cagiirip dogru calistiklarini kontrol edin.

        int fiyat=100;
        System.out.println("Yuzde 10 indirimden sonra: "+indirim10(fiyat));
        System.out.println("Yuzde 20 indirimden sonra: "+indirim20(fiyat));
        System.out.println("Yuzde 25 indirimden sonra: "+indirim25(fiyat));

    }

    private static int indirim25(int fiyat) {
        fiyat*=0.75;
        return fiyat;
    }

    private static int indirim20(int fiyat) {
        fiyat*=0.80;
        return fiyat;
    }
    private static int indirim10(int fiyat) {
        fiyat*=0.9;
        return fiyat;
    }
}
