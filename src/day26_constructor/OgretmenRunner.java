package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1"+ogretmen1);
        System.out.println("");

        Ogretmen ogretmen2=new Ogretmen("Mustafa","SAK","1/1/1993","Fen","IT");
        System.out.println("Ogretmen 2"+ogretmen2);
        System.out.println("");

        Ogretmen ogretmen3=new Ogretmen("Mehmet","Bulutluoz","5/6/1982");
        System.out.println("Ogretmen 3"+ogretmen3);

    }
}
