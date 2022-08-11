package practice01.day03;

public class Serbest_Calisma2 {
    public static void main(String[] args) {

        int input=34567;
        int ilkIki=(input/1000);
        int onbinler=ilkIki/10;
        int binler=ilkIki%10;
        System.out.println(onbinler);
        System.out.println(binler);
       // System.out.println(ilkIki);
        int sonIki=(input-ilkIki*1000)%100;
       // System.out.println(sonIki);
        int onlar=sonIki/10;
        System.out.println(onlar);
        int birler=sonIki%10;
        System.out.println(birler);
        System.out.println(onbinler+binler+onlar+birler+"toplam");



    }
}
