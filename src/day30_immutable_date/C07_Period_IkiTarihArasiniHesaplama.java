package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period_IkiTarihArasiniHesaplama {
    public static void main(String[] args) {
        //iki tarih arasinda sureyi bulma

        LocalDate tarih1=LocalDate.of(1993,2,23);
        LocalDate bugun=LocalDate.now();



        Period period=Period.between(tarih1,bugun);//tarih1 ile bugun arasindaki  yil,ay,gun olarak verir
        System.out.println(period);

        System.out.println(period.getYears());//tarih1 ile bugun arasindaki  yil olarak verir

        LocalDate cezaEvineGiris=LocalDate.of(2017,7,17);
        LocalDate cezaEvindenCikis=LocalDate.of(2022,2,28);
        Period periodC=Period.between(cezaEvineGiris,cezaEvindenCikis);
        System.out.println(periodC);
    }
}
