package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //Erkek-Kadın olup olmadığını kontrol etsin
        //Erkekse 65 yaş üzrinde ise emekli olsun
        //Kadınsa 60 yaş üzrinde ise emekli olsun
        //Nested demek "iç içe" geçmek demektir.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazın:");
        char cinsiyet=scan.next().toUpperCase().charAt(0); // cinsiyeti girilince ilk harfi tutmak icin yaptık.

        System.out.println("Lütfen yaşınızı giriniz:");
        double yas=scan.nextDouble();

        if (cinsiyet =='E')
        {if (yas>=65) // iç içe if yaptık nested if denir.
        {
            System.out.println("Cinsiyet: Erkek\nYaş: "+yas+"\nEmeklisiniz");
        }else { // if bodys'nin şartının zıttını verir.
            System.out.println("Daha emekli değilsiniz, Çalışmanız gerekiyor...");
        }
        }
        else if (cinsiyet =='K')
        {
            if (yas>=60)
            {
                System.out.println("Cinsiyet: Kadın\nYaş: "+yas+"\nEmeklisiniz");
            }else {
                System.out.println("Daha emekli değilsiniz, Çalışmanız gerekiyor...");
            }

        }else {
            System.out.println("Doğru düzgün cinsiyet girin");
        }
    }
}
