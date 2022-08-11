package PatikaDev;

public class day14_StringManipulation {
    public static void main(String[] args) {
        //  indexof sıfırdan saymaya baslar.
        String str="patika";
        System.out.println(str.charAt(2));  // ekrana t harfini yazdırır. İndex numaralar sıfırdan başlar yazmaya..
        String aleyna="kabacı";
        System.out.println(aleyna.codePointAt(2)); // codePointAt degeri yazdıgımız degerin hangi harf ise onun ascii table degerini yazdirir.
        // mesela yukarda  "b" harfine denk geliyor, b harfide ascii table tablosunda degeri 98 bu yüzden 98 çıktısı alırız.
        String rg10="Gokbulut";
        System.out.println(rg10.equalsIgnoreCase(rg10)); // "equalsIgnoreCase" methodu kucuk ya da buyuk harf duyarlılıgın kaldırır.
        String kapsıyorMu="cr7";
        System.out.println(kapsıyorMu.contains("r")); // "contains" methodu bir şeyi kapsıyorMu diye kontrol eder cr7  r harfini kapsadığı için true yazar.
        String birlestirelimMi= "Ramazan Aleyna";
        System.out.println(birlestirelimMi.concat("RamazanAleyna")); // "concat" iki string ifadeyi birlestirmeye yarar.
        System.out.println(birlestirelimMi.endsWith("na")); // "endsWith" kelimenin ne ile bittigini kontrol eder. na ile bittigi icin true yanar.
        String ornek= "farukemingokbulut";
        System.out.println(ornek.indexOf("1"));
        System.out.println(ornek.lastIndexOf("1"));
        System.out.println(ornek.isEmpty()); // isEmpty methodu string'in bos olup olmadıgını kontrol eder. false yandı cunku bos degil.
        System.out.println(ornek.length()); // length methodu string'in uzunlugunu verir yani 17 yazdiri.
        System.out.println(ornek.replace("f","k")); // replace methodu string'in belirli harflerini degismek icin kullanılır "f" harfi ile "k" harfini degistim mesela :)
        System.out.println(ornek.replaceAll("faruk","kadir")); // replaceall methodu string'in belirli kısımlarını degistirmek icin kullanılır. faruk yazısını kadir yaptım.
        System.out.println(ornek.startsWith("f"));// startsWith methodu baslangıc degerlerini sorgular dogruysa true yanlıssa false yanar.
        System.out.println(ornek.substring(2)); // substring methodu kaç yazarsak o harf hangisine denk geliyorsa ordan baslar ve sona kadar yazar.
        System.out.println(birlestirelimMi.substring(0,8)); // substring methodunda iki deger verirsek ilk deger neyse ordan baslar diger degere kadar aralık neyse ora kadar yazdırır. Ramazan yazdirir burda :) reeldeki gibi yalnızız.
        System.out.println(ornek.toUpperCase()); // toUpperCase methodu string'in tum harfleirni buyuk yazdirir.
        System.out.println(ornek.toLowerCase());// toLowerCase methodun string'in tum harflerini kucuk yazdirir.
        String boslukMu="    R a m a z a n     ";
        System.out.println(boslukMu.trim()); // trim methodu bir string'in her iki ucundaki boslukları siler. R a m a z a n cıktısı :)







    }
}
