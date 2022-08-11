package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //Erkek-Kadın olup olmadığını kontrol etsin
        //Erkekse 65 yaş üzrinde ise emekli olsun
        //Kadınsa 60 yaş üzrinde ise emekli olsun

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazın:");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz:");
        double yas=scan.nextDouble();

        if (cinsiyet =='E')
        {if (yas>=65)
        {
            System.out.println("Cinsiyet: Erkek\nYaş: "+yas+"\nEmeklisiniz");
        }else {
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
