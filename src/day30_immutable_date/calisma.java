package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class calisma {
    public static void main(String[] args) throws InterruptedException {
        LocalTime baslangic=LocalTime.now();
        String str="";
        for (int i = 0; i < 100; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println(bitis.getNano()- baslangic.getNano());

        str="";
        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(".");

        }
        bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println(bitis.getNano()-baslangic.getNano());

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);
    }
}
