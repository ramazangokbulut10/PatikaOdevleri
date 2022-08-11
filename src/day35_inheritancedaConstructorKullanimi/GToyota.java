package day35_inheritancedaConstructorKullanimi;

public class GToyota  {
    GToyota(){
        System.out.println("Toyota parametresiz const.");
    }
    GToyota(String isim){
        //super(isim);extends olmadigi icin super(): const. call'u Java kabul etmez
        System.out.println("Toyota parametreli const.");
    }

}
