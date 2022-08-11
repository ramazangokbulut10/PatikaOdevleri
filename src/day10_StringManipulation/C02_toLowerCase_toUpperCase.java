package day10_StringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";
        System.out.println(str.toUpperCase(Locale.CANADA)); //CANADA daki harflere göre büyültme
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));//Türkiye deki harfler olmadığı için böyle yaptık
    }
}
