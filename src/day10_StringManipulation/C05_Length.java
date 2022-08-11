package day10_StringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";
        System.out.println(str.length());

        System.out.println(str.charAt(str.length() - 1));//son karakteri yazdırma kodu
        System.out.println(str.charAt(18));             //son karakteri yazdırma kodu

        //-----------------null ile hiçliğin("") kıyaslaması-----------------------------------------------------------------

        String str2="";  // str2 ye değer atanmıştır o da hiçlik değeridir.
        System.out.println(str2.length());// değeri olmadığından 0 çıktısı verir


        String str3=null;// str3 e değer atanmamıştır.
        System.out.println(str3.length());// çıktı olarak hata verir

    }
}
