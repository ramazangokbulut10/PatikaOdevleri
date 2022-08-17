package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        /*
         İndexof verilen String'de tek tırnak veya çift tırnak içine yazdığın karakteri bulur ve indexini yani sıfıdan başlayarak sayar ve döndürür.
         Olmayan bir karakteri sorduğumuzda  " -1 " döndürür.
         */

        String str="abcdef gjklmn";

        System.out.println("\'g\' harfi "+str.indexOf("g")+". sıradadır.");//Çift tırnakla yazdırma
        System.out.println("\'g\' harfi "+str.indexOf('g')+". sıradadır.");//Tek tırnakla yazdırma(char olarak bakar tek tırnakta)


        System.out.println(str.indexOf('x'));//olmayan harf -1 değerini döndürür

    }
}
