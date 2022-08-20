package day13_MethodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        /*
         Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
         String str1 = "$13.99"
         String str2 = "$10.55"
         ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
        */

      //  String str1 = "$13.99";
      //  String str2 = "$10.55";
      //  str1=Double.parseDouble(str1.replaceAll("\\D", ""));
      //  System.out.println(str1);
      //  str2=str2.replaceAll("\\D", "");
      //  System.out.println("$"+(Double.parseDouble(str1)+Double.parseDouble(str2)));
         String str1 = "$13.99";
         String str2 = "$10.55";

         str1=str1.replace("$",""); // dolar işaretleri yerine hiçlik koyduk.
         str2=str2.replace("$","");

        System.out.println("$"+(Double.parseDouble(str1)+Double.parseDouble(str2))); // String bir variable double'a çevirdik.



    }
}
