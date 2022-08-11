package day37_overridding;

public class Child extends Parent{
    @Override
    void sakal(int sayi) {
        System.out.println("child sakal overridding"+sayi);
    }

    public static void main(String[] args) {
        Child cocuk=new Child();
        cocuk.sakal(5);


    }

}
