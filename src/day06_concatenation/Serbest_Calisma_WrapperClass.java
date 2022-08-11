package day06_concatenation;

public class Serbest_Calisma_WrapperClass {
    public static void main(String[] args) {

        System.out.println("küçük harfle yazdığım yazı method ile büyüttüm".toUpperCase());
        //Primitevelerde(int,shot,boolean vb.) methodlar gelmez.
        //bunun içinde primiteve türlerinin baş harfini büyük harfle yazarız.

//-------------------------------------------------------------------------------------------------------------

        /*burada boolean data türleri primiteve olduğu için guzel.Mi değişkeninden sonra method gelmedi.

        boolean guzelMi=true;
        guzelMi.

        */

        //altdaki satırda da Boolean türü nonprimitive olduğu için methodlar kullanıldı.
        Boolean guzelMi=true;
        guzelMi.toString();

//-------------------------------------------------------------------------------------------------------------

        //Herhangi bir data türünün alt-üst sınırlarını da bulabilmek içinde aşağıdaki gibi method kullanabiliriz.
        //Fakat önemli nokta data türü yukaraki gibi methodu kullanabilmemiz için nonprimitive olması gereklidir.
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

//-------------------------------------------------------------------------------------------------------------
        //String olarak kayıtedilen bir verinin nasıl integere dönüştürleceği

        String sifre="11111";

        Integer sifreSayi=Integer.parseInt(sifre);//!!String sifre variable'yi integer'a çevirme kod satırı!!!

        System.out.println("String variable: "+sifre+5);//burada String'den integer'a değiştiğini test ettik.
        System.out.println("Integer variable: "+sifreSayi+5);



    }
}
