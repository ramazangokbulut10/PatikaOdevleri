package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);  //19:12:11.198543900

        Thread.sleep(3000); //3sn bekler sonra alt satirdaki kodlari calistirma kodu
        System.out.println(time1);  //19:14:23.129217300

        //11. satirda kodu calistirdigimiz halde time1'i cagirdigimizda yine ayni degeri dondurur
        //Bunun sebebi 8. satirda aldigimiz saat deger olarak time1'e atar.
        //------------------------------------------------------------------------------------------------

        time1=LocalTime.now();//time1 e yeni deger vermek icin boyle tekrar assign ederiz
        System.out.println(time1);


        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(10000));//10000sn sonra saat kac oldugunu hesaplar

        System.out.println(time1.minusMinutes(200));//200dk once saatin kac oldugunu hesaplar

        System.out.println(time1.withHour(3));//zamanin saatini 3 yapar devamini o anki dk ve sn yapar
    }
}
