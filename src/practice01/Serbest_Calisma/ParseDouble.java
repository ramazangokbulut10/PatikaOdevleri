package practice01.Serbest_Calisma;

public class ParseDouble {
    public static void main(String[] args) {
        //String seklinde verilen asagıdaki fiyatlari toplayin
        //String str1="$13.99"
        //String str2="$10.55"
        // ipucu:Double.parseDouble() methodunu kullanabilirsiniz
        String str1="$13.99";
        String str2="$10.55";

        System.out.println(Double.parseDouble(str1.replace("$",""))
                          +Double.parseDouble(str2.replace("$","")));

        System.out.println(13.99+10.55);
    }
}
