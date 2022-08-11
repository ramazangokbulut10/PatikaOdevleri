package PatikaDev;

public class day09_ForDongusu {
    public static void main(String[] args) {
        /*
        Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile bir koşul belirterek döngülerimizi oluşturabiliriz.
         */

        // 1'den 10'a kadar olan çift sayıları yazdıralım.

        for (int i = 1; i <=10 ; i++) {
            if (i%2 == 0) {  // Bir sayının modulus 2 ile bölümünden kalan sıfır ise o sayı çifttir.
                System.out.println(i);
            }
        }
        // 1'den 10'a kadar olan tek sayıları yazdıralım.

        for (int i = 1; i <=10 ; i++) {
            if (i%2 == 1) {  // Bir sayının modulus 2 ile bölümünden kalan "bir" ise o sayı tektir.
                System.out.println(i);
            }
        }

        // 1'den 10'a kadar olan çift sayıların toplamını yazdıralım.
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            if (i%2 == 0) {  // Bir sayının modulus 2 ile bölümünden kalan sıfır ise o sayı çifttir.
                toplam+=i;
            }
        }
        System.out.println("sonuc = " + toplam);// sonucu her zaman for dongusunun dısında yazdıralım.

        // 1'den 20'ye kadar olan sayıları yazdıralm ama çift olan sayıların yerine "Aleyna" yazdıralım.

        for (int i = 0; i <=20 ; i++) {
            if (i%2 == 0) {
                System.out.println("Aleyna");
            }else{
                System.out.println(i);
            }
        }
    }
}
