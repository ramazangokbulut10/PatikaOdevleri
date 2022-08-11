package day25_constructor;

public class deneme {
    public static void main(String[] args) {

        deneme2 car1=new deneme2();
        car1.marka="Ford";
        car1.model="";
        car1.yil=1990;
        System.out.println("Araba Markasi:"+car1.marka+
                        "\nAraba Modeli:"+car1.model+
                "\n Araba Yili:"+car1.yil);

    }
}
