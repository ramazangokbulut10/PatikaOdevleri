package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=50;

        System.out.println(a>0 && b<20 && c>=b);//true
        System.out.println(a<0 && b<20 && c>=b);//false(&& ilk false bulduğunda diğerlerini kontrol etmez)

        System.out.println(a<0 & b<20 & c>=b);//false(& tüm şartları kontroleder sonra cevabı döndürür.)
        // yukarıdaki & tek and işareti şartların tamamını kontrol eder ve yavaş çalışır sonuçlar aynı olur.




    }
}
