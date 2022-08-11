package day26_constructor;

public class Ogretmen {
    String isim="Isim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih belirtilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="yan Brans belirtilmedi";

    public Ogretmen() {//default constructor yerine olusturlan constructor
    }
    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }
    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return  "\nisim:" + isim +
                "\nsoyIsim:" + soyIsim +
                "\ndogumTarihi:" + dogumTarihi +
                "\nbrans:" + brans +
                "\nyanBrans:" + yanBrans;
    }
}
