package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {


        //3 farklı data türünde variable oluşturun ve bunları ekrana yazdırın.


        int sayi=10;
        boolean guzelMi=true;
        char sayim='3';

        System.out.println(sayi);
        System.out.println("sayi");
        System.out.println("sayi: "+sayi);


        //isim ve soyisim için iki variable oluşturun ve bunları isminiz=Mehmet,soyisminiz=Bulutluöz şeklinde yadırın.

        String isim="Mehmet", soyIsim="Bulutluöz";
        System.out.println("İsminiz:"+isim);
        System.out.println("Soyisminiz:"+soyIsim);

        //iki farklı tamsayı data turunde 2 variable oluşturun bunların toplamını yazdırın.

        int sayi1=15,sayi2=25;
        System.out.println("Sayılrın Toplamı:"+(sayi1+sayi2));


        //Bir tam sayı ve bir ondalıklı variable oluşturun ve bunların toplamını yazdırın

        int tamsayi=20;
        double ondalikli=15.2;
        System.out.println("Tamsayı ile ondalıklı sayıları toplamı:"+(tamsayi+ondalikli));

        //char data türünde bir variable oluşturun ve yazdırın

        char tekKarakter='M';
        System.out.println("char değerinde variable: "+tekKarakter);

        //Bir tamsayı bir de char değişken oluşturun ve bunların toplamı yazdırın;

        int sayi4=77;
        char tekKarakter2='A';

        System.out.println("Tamsayı Variable ile char Variablelerinin toplamı:"+(sayi4+tekKarakter2));
        //char variablenın karşılık gelen sayısal değeri(ASCII) ile toplar.

    }

}
