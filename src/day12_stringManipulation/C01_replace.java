package day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {
        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));//Bugunhavacokguzel

        System.out.println(str.replace("h","J"));// Bu gun Ja va cok guz el

        System.out.println(str.replace("h","J").replace(" ",""));//BugunJavacokguzel

        System.out.println(str.replace("guz el","harika"));// Bu gun ha va cok harika

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","hava")
                .replace("guz el","guzel");
        System.out.println(str);//Bugun hava cok guzel
    }
}
