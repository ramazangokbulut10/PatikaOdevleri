package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        /*
        concat methodu iki tane string'i yan yana yazmak icin kullanılır.
        concat islemi sadece (+) islemi olur diğer operatorler ile olmaz !
         */

        // İşlem önceligi sırasıyla : Parantez, Üslü ifadeler, çarpma veya bölme, toplama çıkarma

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        //Java Guzeldir 54  yazdırmak için;
        System.out.println(str1+" "+str2+" "+sayi1+sayi2);

        //Java Guzeldir 9    yazdırmak için;
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));

        //9 Java   yazdırmak için;
        System.out.println(sayi1+sayi2+" "+str1);

        //54 Guzeldir   yazdırmak için;
        System.out.println(""+sayi1+sayi2+" "+str2);  /* en bastaki hiclik string oldugunu ifade ediyor,
         hiclik de String olduğu icin String strong(güçlü) demiştik o sebeple sayi1+sayi2 9 yerine 54 yazdı. */


        // JavaGuzeldir methodla yazdırmak için;
        System.out.println( str1.concat(str2));

        // Java Guzeldir methodla yazdırmak için;
        System.out.println(str1.concat(" ").concat(str2));

        System.out.println(!(3*5>15));

    }
}
