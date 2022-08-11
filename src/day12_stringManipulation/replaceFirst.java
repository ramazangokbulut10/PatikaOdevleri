package day12_stringManipulation;

public class replaceFirst {
    public static void main(String[] args) {
        String str="Java ile hayat guzel";
        System.out.println(str.replaceFirst("a","*"));//ilk a harfini * yapar
        System.out.println(str.replaceFirst("at","*"));//ilk at harfini * yapar

        System.out.println(str.replaceFirst("\\s","_"));
    }
}
