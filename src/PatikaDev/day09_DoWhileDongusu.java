package PatikaDev;

public class day09_DoWhileDongusu {
    public static void main(String[] args) {
        /*
        Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır.
        Ama Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar için Do-while kullanılır.
         */

        // en çok kullanılan dongu "for"  while  en az kullanılan do while döngüsüdür.
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);




    }
}
