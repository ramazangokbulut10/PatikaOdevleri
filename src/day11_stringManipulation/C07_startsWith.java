package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); //TRUE
        System.out.println(input.startsWith("Java gun gec"));//TRUE

        System.out.println(input.startsWith("gun"));//FALSE
        System.out.println(input.startsWith("gun",5));//5 de dahil 5. indexten itibaren bak TRUE
    }
}
