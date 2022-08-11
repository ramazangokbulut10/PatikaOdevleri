package day31_timeFormatter_varargs;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+tarihSaat);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm");
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMMM/yyyy HH:mm a");

        System.out.println(dtf.format(tarihSaat));
        System.out.println(dtf1.format(tarihSaat));
        System.out.println(dtf2.format(tarihSaat));
    }
}
