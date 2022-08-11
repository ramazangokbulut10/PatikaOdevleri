package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetliler: "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }
    protected void izin(){
        System.out.println("Ayda 20 gun yan hizmetli izin kullanir");
    }

    public static void main(String[] args) {

        /*
        Overriding child classtaki bir method'un
        parent class'taki ayni isimdeki method'u etkisiz
        hale getirerek kendisinin spesifik ozelligini
        ortaya cikarmasidir

        Overriding'i nerede dikkate aliyoruz?

       cevap:  bir obje olusturulurken data turu ve
        const. farkli ise...

        Eger bir obje olusturulurken data turu ve const. farkli ise
        objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz
        1-Obje constr. oldugu class'da olusur
        2-Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
        bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
        orada da bulamazsak CTE verir

       Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz

       3-Aranan ozellik method ise degeri yazdirmadan
       once Override edilmismi diye kontrol etmemiz gerekir
       Eger override edildi ise en guncel degeri yazdiririz

          */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai);//-->Muhasebe  8
        System.out.println(yh1.saatUcreti);//-->Muhasebe  10
        yh1.maas();//-->YnaHizmtli-->Yan Hizmetliler: 2160 maas alir
        yh1.ozelSigorta();//-->Muhasebe.. isteyen calisanlara %50 indirimli ozel sigorta yapilir
        yh1.sigorta();//-->Personel..Tum personelimiz sigorta yapilir
        System.out.println(yh1.isim);//-->Personel
        System.out.println(yh1.soyIsim);//-->Personel
        System.out.println(yh1.departman);//-->Personel
        //System.out.println(yh1.issizlikSigorta);
        //Aramaya Muhasebeden basladigimizdan issizlik sigortasi bulamadik..CTE
        EYanHizmetliler yh2=new EYanHizmetliler();

        yh2.izin();//Ayda 20 gun yan hizmetli izin kullanir








    }
}
