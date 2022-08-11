package SerbestCalisma.constructors;

public class Runner {
    public static void main(String[] args) {
        Ogretmen obj1=new Ogretmen("Ismail","Atabay","Sinif Ogretmeni");
        System.out.println(obj1);

        Ogretmen obj2=new Ogretmen("Mustafa","SAK");
        System.out.println(obj2);

        Ogretmen obj3=new Ogretmen();//Bunu denemek icin yaptim
        System.out.println(obj3);//Default Constructor a data ekledim,
        // ve parametresiz constructor girince onlari cagirdi

    }
}
