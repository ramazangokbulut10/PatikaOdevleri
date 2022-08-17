package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {

        /*
           Soru 2) Kullanicidan bir cumle isteyin.
           Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
          “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
           iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
           ikisinide içiriyorsa "karar ver büyük mü küçük mü yazdıralım"

         */

        String cumle="Java buyuk, dunya kucuk";
        if (cumle.contains("buyuk")&& cumle.contains("kucuk"))
        {
            System.out.println("karar ver büyük mü küçük mü yazdıralım?");
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("buyuk"))
        {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Hiçbir şey içermiyor");
        }

    }
}
