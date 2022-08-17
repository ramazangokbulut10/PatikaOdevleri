package day12_stringManipulation;

public class isEmpty {
    public static void main(String[] args) {

        /*
         isEmpty methodu verilen String'in uzunluğu sıfır yani boş ise "True" yoksa false döndürür.
         */

        String input="Java cok guzel";
        String input1="";
        String input2=null;

        System.out.println(input.isEmpty());// verilen değişkenin içinin boş olup olmadığına bakar//FALSE
                                            //Boşsa TRUE - Doluysa FALSE döner
        System.out.println(input1.isEmpty());//TRUE
        System.out.println(input2.isEmpty());//NULL
    }
}
