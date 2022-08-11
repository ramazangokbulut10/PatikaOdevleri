package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {
 String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    public Child()  {
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        //AGrandParent gp1=new AGrandParent();
        /*
        bu objeyi olusturmak icin Grandpa const. calisir
        Parent ve Child cons calismaz
         */

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        /*
        child1 objesi icin Child cons. calisti
         */
            /*
            Java'da bir class'i kullanabilmek icin
            o class'dan obje olusturur dolayisiyla'
            o class'in const. kullanirdik

            Java inheritance da parent class'lardaki ozellikleri kullanabi;lmek icin
            o class'larin constructorlarini otomatik calistiran bir yapi kurmustur.

            Ornenegin biz child class'inda Child class'indan bi obje olusturmak
             istedigimizde Child.const. kullaniriz

            Java Child const. gordugunde once parent'in const. i calistirmam lazim der
            buradan Parent const.'a gider
            Parent class'inda Parent const. i gorunce once bunun parent'ini yani
            Grandparent const. calismasi gerekir der..

            Boylece extence keyword olmayan class'a kadar gider ve oradan baslayarak
            tum const.lari asagi dogru calistirir.
             */


    }
}
