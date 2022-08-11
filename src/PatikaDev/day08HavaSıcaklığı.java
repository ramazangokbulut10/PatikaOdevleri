package PatikaDev;

import java.util.Scanner;

public class day08HavaSıcaklığı {
    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sıcaklık degeri giriniz");
        int sicaklik=scan.nextInt();
        if (sicaklik<5){
            System.out.println("Hava sicakligi kayak yapmaya musait.");
        } else if (sicaklik>=5 && 15>=sicaklik){
            System.out.println("Hava sicakligi sinema icin musait");
        } else if (sicaklik>=15 && sicaklik<=25){
            System.out.println("Hava sicakligi piknik icin musait");
        } else if (sicaklik>25){
            System.out.println("Hava sicakligi yuzme icin musait");
        }else {
            System.out.println("lutfen gecerli bir deger giriniz.");
        }


    }
}
