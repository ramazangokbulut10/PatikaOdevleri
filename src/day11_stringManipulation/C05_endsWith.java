package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {
        String str="Ah be Java";

        System.out.println(str.endsWith("be java"));//büyük küçük harf duyarlı
        System.out.println(str.endsWith("Ah"));// endsWith komutu sondan baktığı için FALSE döndürdü
        System.out.println(str.endsWith("Ah be Jav"));// endsWith komutu sondan baktığı için FALSE döndürdü

        System.out.println(str.endsWith("be Java"));
        System.out.println(str.endsWith(""));


    }
}
