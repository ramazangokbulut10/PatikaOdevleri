package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";//markanin access modifier'i default access modifier
                                        //oldugundan package icinde kullanilabilir
    private String model="Model belirtilmedi";//----set
    private String yakit="Elektrikli";//tum arabalar elektrikli ise  bu variable'in degistirilmemesi lazim---get
    //private yaptigimiz model ve yakit variable;larina ersimi yetkilendirelim
    //model'e deger atabilsin ama gorulemesin(setter)
    //yakit ise gorulebilsin ama yeni deger atamasin isteniyor(getter)
    //


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

}
