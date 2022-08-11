package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        /*
        Bir sorunla karsilasmayi bekledigimiz noktalarda
        if else ile sorunu yakalayip
        onunla ilgilenebilirsiniz

        ama java herzamana if else ile cozemeyecegimizden
        Java try-catch block'lari olusturmustur

         */

        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<100){
            System.out.println(a/b);
            b--;
            sayac++;
            if(b==0){
                b--;
            }
        }

    }
}
