package practice01.day07;

public class Q05_Forloop {

    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        // For ile cozumu : : :
        for (int i = 0; i <256 ; i++) {

            char c= (char) i;

            System.out.println(i+"==>>"+c);

        }

        // while ile : : :
        int sayac=0;
        while (sayac<256){
        char c= (char) sayac;
            sayac++;
            System.out.println(sayac+": "+c);
        }

        //do while  ile : : :
        int sayacDoWhile=0;

        do {
            char karakter=(char) sayacDoWhile;
            System.out.println(sayacDoWhile+" "+karakter);
            sayacDoWhile++;
        }while (sayacDoWhile<256);

    }
}
