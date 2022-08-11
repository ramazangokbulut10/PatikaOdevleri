package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//tarihi yazdiktan sonra T saati verir

        System.out.println(tarihSaat.plusMonths(3).plusHours(2));//tarihi 3 ay 2 saat sonrasını verir

        System.out.println(tarihSaat.getMonth());//Ay i verir

        System.out.println(tarihSaat.toLocalDate());// tarihi verir

    }
}
