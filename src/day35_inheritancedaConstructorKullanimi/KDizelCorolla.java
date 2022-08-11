package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("DizelCorolla parametresiz const.");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("DizelCorolla parametreli const.");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("hasan");
    }
}
