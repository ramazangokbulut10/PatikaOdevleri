package PatikaDev;

public class day08Kosulluİfadeler {
    public static void main(String[] args) {
        /*
        karsılasma operatorlerinin sonucu "boolean" olur cunku  5>4  bunun sonucu 9 veya baska bir sey olmaz  5 buyuktur 4'ten ve true yazar.
           = tek esit isareti matematikten farklı olarak sadece atama islemi yapar.
          == esit esit isaretidir   5==5;
          != esit degil isaretidir.    7!=5;
          >= buyuk esittir isareti      7>5   5>=5
          <= kucuk esittir isareti      5<=5
        Eger boolean bir sonucu tersine cevirmek istersek basına "!" koymamız yeterlidir.
          && Ve operatoru mukemmelliyetcidir bir tane false tamamını false yapar.
                her iki sartinda gecerli olması gerekiyorsan and(ve) kullanılır.
          || Veya operatoru tek bir tane doğruyu bile true kabul eder.
          herhangi bir sarttan birisi bile olsa kabul eder
         */

          int a =20, b=22;
          boolean compare= a==b;
          //String str =compare?"Esittir": "Esit degildir";  // Ternary Operator denir.
          // System.out.println(str);
        if (compare) { // ister kosulu compare degere atayarak yaz istersede if'in icine direkt kosulu yazabilirsin.
            System.out.println("Esittir");
        } else {
            System.out.println("Esit degildir.");



        }

    }
}
