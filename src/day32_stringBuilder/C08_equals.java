package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Jave");
        String str="Java";
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(str));//false
        System.out.println(str.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true
        //String Builder'da equal method'u ancak ayni obje olursa true doner
        //String'deki gibi dusunmemek lazim

        System.out.println(sb1.compareTo(sb2));//0
        System.out.println(sb1.compareTo(sb3));//-4--->>a ile e arasindaki 4 birim fark var


        /*
        compareTo method'u 2 StringBuilder'i bastan baslayarak harf harf karsilastirir
        Ilk harfler ayni ise 2. lere ,2.ler ayni ise 3.'lere gecer ve
        ilk farkli olan harfe kadar gider.Farkli olan 2 harfin ascii kodlari arasindaki farki verir
        Eger hic fark yoksa 0 dondurur
         */

        StringBuilder sb4=new StringBuilder("ab");
        StringBuilder sb5=new StringBuilder("cd");

        System.out.println(sb4.compareTo(sb5));//-2--->sadece ilk farkli harfe bakar







    }
}
