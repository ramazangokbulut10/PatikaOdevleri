package day28_staticBlock;

public class StaticBlock {
    static  int sayi;

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println("class'daki sayi+10 variablesi: "+(sayi+10));
    }
    static {//static block class uyelirinin tamamindan once calisir.(main' den de once calisir)
        System.out.println("1. siradaki static blok calisti");
        System.out.println("1. siradaki static blok sayi variablesi: "+(sayi+50));
    }
    static {
        System.out.println("2. siradaki static blok calisti");
        System.out.println("2. siradaki static blok sayi variablesi: "+(sayi+30));
    }
}
