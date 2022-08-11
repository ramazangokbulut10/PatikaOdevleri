package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler(){
        System.out.println("Matematikciler parametresiz const");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli const");
    }

    public static void main(String[] args) {

        Matematikciler obj1=new Matematikciler("Tugba");

    }
    /*
    this() const. call icinde bulunulan class'daki const. lari
     'super(): call ise  parent class'da bulunan const.lari cagirir

     this() veya super() parametre yapisina uygun bir const. bulamazsa
     Java CTE verir

     const. konusunda gordugumuz this().
     o class'daki instance variable lari refere ediyordu

     inheritance'da da super(). vardir
     super(). parent class'daki instance'lari refere eder
     */

}
