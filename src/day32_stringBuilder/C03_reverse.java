package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        /*
        Verilen bir input'u tersine cevirip,
         bize donduren bir method olusturun
         */

        String input="Hey gidi for loop gunleri";
        String tersInput=tersineCevir(input);
        System.out.println("tersInput = " + tersInput);//tersInput = irelnug pool rof idig yeH

        String str="abc";
        StringBuilder sb2=new StringBuilder(str);
        System.out.println("sb2.reverse() = " + sb2.reverse());

    }

    public static String tersineCevir(String input) {
        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();



    }
}
