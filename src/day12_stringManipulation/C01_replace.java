package day12_stringManipulation;

public class    C01_replace {
    public static void main(String[] args) {

        /*
         String methodlarından "replace" methodu yerini değiştirme methodudur.
         System.out.println(str.replace("h","J"));// inputun içindeki "h" harflerini "j" yapacak tüm "h" harflerini "j" yapar metin içindeki.
         */

        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));//Bugunhavacokguzel

        System.out.println(str.replace("h","J"));// Bu gun Ja va cok guz el

        System.out.println(str.replace("h","J").replace(" ",""));//BugunJavacokguzel
        // String methodlarını arka arkaya istediğiniz kadar kullanabilirsiniz.

        System.out.println(str.replace("guz el","harika"));// Bu gun ha va cok harika

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","hava")
                .replace("guz el","guzel");
        System.out.println(str);//Bugun hava cok guzel
    }
}
