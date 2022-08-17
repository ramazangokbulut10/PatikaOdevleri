package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        /*
         String methodlarından "startsWith" istenen karakterlerin başlayıp başlamadığını kontrol eder.
         Eğer başlıyorsa true başlamıyorsa false yanar.
         */

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); //TRUE
        System.out.println(input.startsWith("Java gun gec"));//TRUE

        System.out.println(input.startsWith("gun"));//FALSE
        System.out.println(input.startsWith("gun",5));// 5.index ve sonrası gün ile mi başlıyor? Evet "True" yanar. (5 dahil)
    }
}
