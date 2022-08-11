package day20_Arrays;

public class C01_LocalVariables {

    public static void main(String[] args) {
        int sayi=10;
        for (int i=0; i<20; i++) {
            System.out.println(i);
        }//i local loopta olusturulmus bir variable dir.

    }
    public static void method1() {
        //System.out.println(sayi);//local bir variable oldugu icin burada calismiyor
        int sayiMethod=20;
    }
}
