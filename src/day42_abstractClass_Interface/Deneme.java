package day42_abstractClass_Interface;

public class Deneme extends Abstract_Deneme implements I02_Interfaces,I03_Interfaces{
    public static void main(String[] args) {
        Deneme obj=new Deneme();

        System.out.println(obj.ISIM);
        System.out.println(ISIM);
        System.out.println(I02_Interfaces.SAYI);


    }

    @Override
    void isik() {

    }

    @Override
    public void ses() {

    }

    @Override
    public void yakit() {

    }
}
