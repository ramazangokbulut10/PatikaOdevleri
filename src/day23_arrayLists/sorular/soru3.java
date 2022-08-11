package day23_arrayLists.sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        listeyeDisardanVeriEkle(list);
    }
    private static void listeyeDisardanVeriEkle(List<String> list) {
        String deger="";
        int kontrol=0;

        while (kontrol==0)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Element Girin :");
            deger=scan.nextLine();
            if (!deger.equals("Q")){
                list.add(deger);
                System.out.println("Liste :"+list);
            }else {System.out.println("Cikis degeri girdiniz Kapatiliyor..."); kontrol++;}

        }
    }
}
