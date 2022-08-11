package day25_constructor;

public class C03 {
    //Javada default Constructor vardir
    //yeni constructor olusrursak default constructor silinir

    //1- Obje olusturmak icin constructor kullanmak zorundayiz
//2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
//3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
    C03()//Parametresiz Constructor
    {

    }
    String isim="Etka";

    public  void method1(){
        System.out.println("C03 Method calistir");
    }

}
