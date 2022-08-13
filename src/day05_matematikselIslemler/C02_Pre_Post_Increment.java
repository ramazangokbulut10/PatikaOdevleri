package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment : "+ ++sayi); // sayı 11 oldu

        System.out.println("post-increment : "+ sayi++); // yazdırdık 11 olarak sonra arttırdık

        System.out.println("post-increment'den sonra : "+ sayi); // sayı variablenı yazdırınca "12" oldu. cunku
        // bir üst satırda arttırdık ama yazdırmadık.

//---------------------------------------------------------------------------------------------------

        int i = 2;
        i = i++ * ++i * 2;//bu satırda eşitlikten sonra i++ yaparak i'nin değeri bir sonraki işlemde +1 artmıştır
      //i = 2   *(3+1)* 2
        System.out.println("i = " + i);
        int x = 1;
        x = ++x * x++ * x;
      //x = 2   * 2   * 3
        System.out.println("x = " + x);

    }
}
