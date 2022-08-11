package day10_StringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="ali can";
        String str3="ALI CAN";
        String str4="Ali Can_";

        System.out.println(str1.equals(str2));//metinin büyük küçük harf olarak da aynı olmasına bakar
        System.out.println(str1.equalsIgnoreCase(str2));//metinin büyük küçük harf önemsemeden tamamen karakterlerin aynı olmasına bakar


    }
}
