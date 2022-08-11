package practice01.day09;

public class Q04_BoslukHaricSay {
    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String str="Verilen bir";
        str=str.replace(" ","");
        System.out.println("str= "+str);

        System.out.println("str.lenght() : "+str.length());

        String[] harf=str.split("");
        System.out.println("arr "+harf.length);


        String str1="Verilen bir";
        String kelime[]=str1.split(" ");
        int boslukSayisi= kelime.length-1;
        System.out.println("boslukSayisi= "+boslukSayisi);


        String charactersay[]=str1.split("");
        System.out.println("charactersay = "+(charactersay.length-boslukSayisi));
    }
}
