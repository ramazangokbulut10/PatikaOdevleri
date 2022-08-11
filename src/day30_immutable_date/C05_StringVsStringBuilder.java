package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        //String mi yoksa StringBuilder mi daha hizlidir?
        //Bunun icin bir String'e 10000 kere sonuna . ekleyelim

        LocalTime baslangic=LocalTime.now();
        String str="Ahhhhh Java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("Strin zamani: "+(bitis.getNano()- baslangic.getNano()));

        System.out.println("");

        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhhhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder zamani: "+(bitis.getNano()- baslangic.getNano()));
    }
}
