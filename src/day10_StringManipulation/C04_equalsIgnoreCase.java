package day10_StringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        /*
        // equalsIgnoreCase() metinin büyük küçük harf önemsemeden tamamen karakterlerin aynı olmasına bakar
         */
        String str1="Ali Can";
        String str2="ali can";
        String str3="ALI CAN";
        String str4="Ali Can_";

        System.out.println(str1.equals(str2));//metinin büyük küçük harf olarak da aynı olmasına bakar  FALSE
        System.out.println(str1.equalsIgnoreCase(str2));//metinin büyük küçük harf önemsemeden tamamen karakterlerin aynı olmasına bakar. TRUE

        /*
        Sadece büyük kücük harf farklılıgın önler, en ufak yazı farklılığında false döner.
         */



    }
}
