package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);//CTE
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz Java
        Compile Time'da bunu farkeder ve buna izin vermez
         */

        str=null;//----->>Gecici cozum

        System.out.println(str);//null
        //System.out.println(str.length());---->>NullPointerException

        Object obj="JAva Java Java";


        Integer sayi= (Integer) obj;//ClassCastException

        /*
        String str2="Hava Civa ";
        Integer sayi2=str2;
        Java bazi casting islemlerine compile time 'da izin vermez
        Ancak bazen syntax uygun olabilir
       Bu durum da java kodun calismasina itiraz etmez
         */

        Thread.sleep(5000);





    }
}
