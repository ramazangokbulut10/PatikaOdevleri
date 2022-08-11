package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar: "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//Memurlar: 3240 maas alir
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Personeldan alir-->Tum personelimiz sigorta yapilir
        System.out.println(mmr1.isim);//Personeldan alir-->Isim belirtilmedi
        System.out.println(mmr1.soyIsim);//Personeldan alir-->soyisim belirtilmedi
        System.out.println(mmr1.departman);//Personeldan alir-->departman belirtilmedi

        BMuhasebe mhsb1=new BMuhasebe();

        /*
        Her ne kadar memur class'inin icnde olsam da olusturdugum obje
        Muhasebe class'indan ..cunku data turu ve const. BMuhasebe

        BMuhasebe class'i da obje olusturulabilen
        bir class'dir yani data turudur

         */

        System.out.println(mhsb1.gunlukMesai);//8-->Muhasebeden alir
        System.out.println(mhsb1.saatUcreti);//10-->Muhasebeden alir
        mhsb1.maas();//Personel minumum : "2400 maas alir"-->Muhasebeden alir
        mhsb1.ozelSigorta();//isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();//Personeldan alir-->Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim);//Personeldan alir-->Isim belirtilmedi
        System.out.println(mhsb1.soyIsim);//Personeldan alir-->soyisim belirtilmedi
        System.out.println(mhsb1.departman);//Personeldan alir-->departman belirtilmedi







    }

}
