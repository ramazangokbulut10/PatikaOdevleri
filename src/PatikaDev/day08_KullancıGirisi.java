package PatikaDev;

import java.util.Scanner;

public class day08_KullancıGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.




         */
        String username, password, newn, a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz:");
        username = inp.nextLine();
        System.out.print("Kullanci sifrenizi giriniz:");
        password = inp.nextLine();
        if (username.equals("Name") && password.equals("Kullanici123")) {
            System.out.println("Hesabinize Giris Yaptiniz!");
        } else {
            System.out.println("Yanlis Giris Denemesi");
            System.out.print("sifrenizi degistirmek icin y'e basiniz\n mevcut sifre ile devam etmek icin n'e basınız\n Seciminiz:");
            a = inp.nextLine();
            if (a.equals("n")) {
                System.out.println("Mevcut sifreniz ile devam edebilirsiniz.");
            } else if (a.equals("y")) {
                System.out.print("yeni sifrenizi giriniz:");
                newn = inp.nextLine();
                if (newn.equals("Kullanici123") || newn.equals(password)) {
                    System.out.println("Yeni sifre eskisi ile ayni olamaz tekrar sifre olusturun");
                } else {
                    System.out.println("sifre basari ile degistirildi.");
                }
            } else {
                System.out.println("hatali secim yaptiniz lutfen tekrar deneyin");
            }
        }

    }
}
