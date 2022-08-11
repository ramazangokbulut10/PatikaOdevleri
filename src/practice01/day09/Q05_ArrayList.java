package practice01.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */

    public static void main(String[] args) {
        List<String> databaseIsimler=new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("Abdulbaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oguz");
        System.out.println("");

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username'i giriniz :");
        String username=scan.nextLine().trim();

        boolean userNameVarMi=databaseIsimler.contains(username);
        if (userNameVarMi){
            System.out.println("Bu kullanici zaten alinmis");

        }else {
            System.out.println("Bu kullanici adini kullanabilirsiniz");

        }if(userNameVarMi){
            int randonsayi=new Random().nextInt(100);
            username+=" "+randonsayi;
            System.out.println("    Yeni kullanici adiniz:");
        }else {
            System.out.println("yeni kullanici adiniz : "+username);
        }
    }
}
