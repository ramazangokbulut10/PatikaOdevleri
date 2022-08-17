package day12_stringManipulation;

public class trim {
    public static void main(String[] args) {
        String str="     Java Ogrenmek Coook Guzel.    ";


        //trim kodu başdaki ve sondaki boşlukları siler

        System.out.println(str);//     Java Ogrenmek Coook Guzel.
        System.out.println(str.length());//35

        System.out.println(str.trim());//Java Ogrenmek Coook Guzel.
        System.out.println(str.trim().length());//26

        String str2="     Ramazan GOKBULUT   ";
        System.out.println(str2.trim());
    }
}
