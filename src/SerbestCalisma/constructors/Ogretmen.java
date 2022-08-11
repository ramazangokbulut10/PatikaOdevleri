package SerbestCalisma.constructors;

public class Ogretmen {
    String isim = "Belitilmedi";
    String soyIsim = "Belitilmedi";
    String brans= "Belitilmedi";
    Ogretmen(){
        isim="Parametresiz isim";
        soyIsim="Parametresiz soyisim";
        brans="Parametresiz brans";

    }
    Ogretmen(String isim,String soyIsim,String brans){
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.brans=brans;

    }
    Ogretmen(String isim,String soyIsim){
        this.isim=isim;
        this.soyIsim=soyIsim;

    }

    @Override
    public String toString() {
        return "Ogretmen : " +
                "isim= " + isim +
                " soyIsim= " + soyIsim +
                " brans= " + brans
                ;
    }
}

