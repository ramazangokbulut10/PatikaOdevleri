package day12_stringManipulation;

public class replaceFirst {
    public static void main(String[] args) {
        /*
        replaceFirst methodu verilen String'in istenen karakterini, istenen yeni karaketer ile değiştirir.
        Verilen input mesela = "Aleyna"  "a" harflerini "ö" yapmak istesen sadece en baştakini yapar first adı üstü ilk demek. :)
         */
        String str="Java ile hayat guzel";
        System.out.println(str.replaceFirst("a","*"));//ilk a harfini * yapar
        System.out.println(str.replaceFirst("at","*"));//ilk at harfini * yapar

        System.out.println(str.replaceFirst("\\s","_"));
    }
}
