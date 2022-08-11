package PatikaDev;

public class day01Basitİslemler {
    public static void main(String[] args) {
        System.out.println("Java 101 Patikası");
        System.out.print("Ramazan");
        System.out.print(" GÖKBULUT\n");
        System.out.println("");

        System.out.println("Aleyna\tKabacı");  // Bir tab bosluk bırakmaya yarar. Çıktısı   Aleyna Kabacı

                System.out.println("Sema\rGökbörü"); // Kendisinden onceki her seyi siler.  Çıktısı Gökbörü
        /*

        \n  Alt satıra inmek icin kullanilir.  // Çok kullanılır
        \t  Bir tab bosluk bırakmaya yarar.    // Çok kullanılır
        \b  Bir tab bosluk silmeye yarar.
        \r  Kendisinden onceki her seyi siler.
         */

        // Yorum satırı yapmak icin iki slash yan yana kullanırız ya da toplu halde yapmak icin /*  */ arasına yazarız.
        /*
                Scanner scan = new Scanner(System.in);
                System.out.print("Lütfen deger giriniz.")

        long sayi3=30;
        long sayi4=sayi3++;
        System.out.println("sayi4:"+sayi4); // 30 çıktısını verir cünkü java matematiksel önceligi iyi bilir önce soldaki islemi yaptı 30 degiskenini sayi4'e atadı,daha sonra sayi3 degiskenini bir arttırdı ve 31 oldu sonu
        System.out.println("sayi3:"+sayi3); // 31 cıktısını verir cünkü sayi4 degiskenini atadıktan sonra sayi 3'ü bir arttırdı ve 31 oldu.
        // Pre demek önce demek aklına ordan gelsin yukarıdaki islem onunla ilgili.

        long sayi5=50;
        long sayi6=++sayi5;
        System.out.println("sayi5:"+sayi5); // 51 cıktısını alırız cünkü once solu yaptı 50+1=51 oldu ve sonra degeri atadı.
        System.out.println("sayi6:"+sayi6); // 51 cıktısını alırız cünkü once solu yaptı 50+1=51 oldu ve sonra degeri atadı.
        // Post demek sonra demek aklına orda gelsin yukarıdaki islem onunla ilgili.
                               // Operatorler

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
           herhangi bir sarttan birisi bile olsa kabul eder.
                                                           CONCAT
        // String bir deger veya variable ile baska bir data turundeki degisken veya degeri + isareti ile toplamak istediginizde java bu iki degeri birlestirir. (concat)
           String str1="Aleyna"
           String str2="Kabacı"
                      System.out.println(str1.concat(" ").concat(str2)); // Aleyna Kabacı

         */



    }
}
