package day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{
    HCorolla(){
        System.out.println("Corolla parametresiz const.");
    }
    HCorolla(String isim){
        super(isim);
        System.out.println("Corolla parametreli const.");
    }
}
