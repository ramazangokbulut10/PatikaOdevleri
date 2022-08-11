package day18_while_doWhileLoop;

public class While_Dowhile_C02 {
    /*
    Kullanicidan alinan sayinin rakamlar toplamini bulun
     */
    public static void main(String[] args) {
        int input=222;
        int birlerBamagi=0;
        int temp=input;
        int toplam=0;



        while (temp>0){
            birlerBamagi=temp%10;
           System.out.print(birlerBamagi+" ");
          temp/=10;

          toplam+=birlerBamagi;
        }
        System.out.println("Toplam while="+toplam);


        //--------------------------------------------------------

        temp=input;
        toplam=0;
        birlerBamagi=0;
        do{
            birlerBamagi=temp%10;
            toplam+=birlerBamagi;
            temp/=10;
            System.out.print(birlerBamagi+" ");
        }while (temp>0);
        System.out.println("Toplam do while="+toplam);



    }
}
