package day36_inheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim="Isim belirtilmedi";
    protected String soyIsim="soyisim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum pesonelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personelimiz sigorta yapilir");
    }
}
