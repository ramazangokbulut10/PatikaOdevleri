package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {

        /*
        Child class dan parent class' a erisimde access modifier kurallarini bypass edemeyiz
        Ornegin parent class'daki private class uyelerini child class'dan kullanamayiz.
        Ayni sekilde parent ve child farkli package'larda ise  parent class'daki default access modifier
         olan class uyelerini child class'dan kullanamayiz.
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota


    }

}
