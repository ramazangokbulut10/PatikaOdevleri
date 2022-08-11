package SerbestCalisma;

import java.util.Scanner;

public class GirilenKelimeMetindeVarMi {
    public static void main(String[] args) {
      // Scanner scan=new Scanner(System.in);

      // System.out.println("Metin Girin :");
        String metin="mustafa saksak";
      //  System.out.println("Aranacak olan ifadeyi girin : ");
        String aranacakIfade="a";

        int kontrol=0;
        String arama="";
        for (int i = 0; i <=metin.length()-aranacakIfade.length() ; i++) {

            arama=metin.substring(i,aranacakIfade.length()+i);
            if(arama.equalsIgnoreCase(aranacakIfade)){
                kontrol++;
            }
        }
        System.out.println("Aranan ifade "+kontrol+" adet var");

    }

}
