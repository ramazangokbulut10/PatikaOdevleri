package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayilim
        Kullaniciya index sorup o index'teki urunu yazdiran bir program  hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim

         */

        String[] urunler={"Nutella","Cokokrem","Sut","Findik"};
        Scanner scan=new Scanner(System.in);
        System.out.print("Istediginiz urunun sira no'sunu giriniz : ");


        int istenenSira=0;

        while(true){


        try {//------------------------------------->>1-)risk olan kismi yazar
             istenenSira=scan.nextInt();
        } catch (InputMismatchException deneme) {//----------------->2-)yakalanacak exc. turu ve icine konulacak obje
            System.out.println("Urun index'i icin bir tamsayi girmelisiniz");//--->3-)catch blogu yakalaninca
            System.out.println("deneme = " + deneme);                             // ne yapacagimiz yazar

        }
        /*
        catch blogunun onundeki parantezde exception class'inin ismi ve yaninda
        yakalanan exception 'i atadigimiz variable'in ismi olur(e)

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz

        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci
        yoksa e kullanilmasa da kod calisir
         */
            if(istenenSira!=0||istenenSira!=1 ||istenenSira!=2 ||istenenSira!=3 ){
                System.out.println("Lutfen tekrar deneyiniz");
                try {
                    istenenSira=scan.nextInt();

                } catch (InputMismatchException deneme) {
                    System.out.println("Urun index'i icin bir tamsayi girmelisiniz");
                    System.out.println("deneme = " + deneme);

                }
            }else break;

        try {
            System.out.println("urunler[istenenSira] = " + urunler[istenenSira-1]);
            break;
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Lutfen sira hmmm");
        }
        }
    }
}
