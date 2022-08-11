package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{


    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    Parent class'taki stansaert belirleyici methodlar
    (abstract method)'larin tamami child class tarafindan override edilmelidir
    Concrete method'larin override edilme mecburiyeti yoktur
    istersek override ederiz, istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretebilecegimiz bir class degil
    Bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'ini da abstract yapmaniz guzel olur.

     */

}
