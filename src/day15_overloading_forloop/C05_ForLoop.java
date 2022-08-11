package day15_overloading_forloop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //1 den 5dahil kadar olan tamsayıları toplayalım
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        //30 dahil 50 dahil, aralarındaki çift sayıları toplayın
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("30 dahil 50 dahil, aralarındaki çift sayılar toplamı : "+toplam);

        //1500 ile 1600(sınırlar dahil) arasında 7 ile bolunebilen sayıların toplamı
            toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
            toplam+=i;
            }
        }
        System.out.println("30 dahil 50 dahil, aralarındaki çift sayılar toplamı : "+toplam);

    }
}
