package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");


        System.out.println(sb.replace(5, 10, "Up"));//Calm Up

        System.out.println(sb.replace(4, 5, "--*--"));//Calm--*--Up

        System.out.println(sb.replace(4, 9, " "));//Calm Up
        System.out.println(sb.replace(5, 7, "Down"));//Calm Down


    }
}
