package day30_immutable_date;

public class ss {
    public static void main(String[] args) {
        String s="Hello";

        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

        if(t==s)System.out.println("two");//referanlari farkli,burasi olmaz

        if(t.equals(s)) System.out.println("three");

        if("Hello"==s)System.out.println("four");//s basit bir sekilde olusturuldugu icin burasi olur

        if("Hello"==t)System.out.println("five");//t new keywordu ile olusturuldugu için burasi esit olmaz

        //one
        //three
        //four

    }
}
