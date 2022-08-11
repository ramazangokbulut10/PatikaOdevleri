package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("Kamyon1 Ozellikleri: "+kamyon1.toString());

        System.out.println("");

        Kamyon kamyon2=new Kamyon("mercedes","4562",2010,100000);
        System.out.println("kamyon2 bilgileri "+kamyon2.toString());

        System.out.println("");

        Kamyon kamyon3=new Kamyon("MAN","As900",2002,125324);
        System.out.println("kamyon3 bilgileri "+kamyon3.toString());

        System.out.println("");

        Kamyon kamyon4=new Kamyon("Scania","s540");//2 tane veri girisi yaptik
        System.out.println("kamyon4 bilgileri "+kamyon4.toString());
    }
}
