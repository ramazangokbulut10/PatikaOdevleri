package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){

        System.out.println("Ogretmen parametresiz const");
    }
    LOgretmen(String isim){
        this();
        System.out.println("Ogretmen parametreli const");
    }

}
