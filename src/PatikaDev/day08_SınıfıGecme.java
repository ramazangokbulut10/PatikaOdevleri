package PatikaDev;

import java.util.Scanner;

public class day08_SınıfıGecme {
    public static void main(String[] args) {
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

         Scanner scan= new Scanner(System.in);
         System.out.println("Lutfen matematik notunuzu giriniz.");
         int matematikNot=scan.nextInt();
         System.out.println("Lutfen turkce notunuzu giriniz.");
         int turkceNot=scan.nextInt();
         System.out.println("Lutfen muzik notunuzu giriniz.");
         int muzikNot=scan.nextInt();
         double ortalama=(matematikNot+turkceNot+muzikNot)/3;
         System.out.println("ortalama = " + ortalama);
         if (matematikNot<0 || matematikNot>=100){
             System.out.println("Notunuz 50'den dusuk ortalamaya katılamaz:(");
         }


// buna bak tekrarrrrrrrrrrrrrrrrrrrrrrrrrr
















    }
}
