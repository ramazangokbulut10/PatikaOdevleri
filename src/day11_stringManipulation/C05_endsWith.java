package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {

        /*
         String methodlarından "endsWith" istenen karakterlerin bitip bitmediğini kontrol eder.
         Eğer bitiyorsa true bitmiyorsa false yanar.
         */

        String str="Ah be Java";

        System.out.println(str.endsWith("be java"));//büyük küçük harf duyarlı o yüzden false yanar.
        System.out.println(str.endsWith("Ah"));// endsWith komutu sondan baktığı için FALSE döndürdü
        System.out.println(str.endsWith("Ah be Jav"));// endsWith komutu sondan baktığı için FALSE döndürdü

        System.out.println(str.endsWith("be Java"));
        System.out.println(str.endsWith("")); // true yanar, en sonda hiçbir şey yok :)


    }
}
