package day18_while_doWhileLoop;

public class C02_WhileLoop {
    /*
    Kullanicidan bir sayi alin
    rakamlarini toplatin
     */
    public static void main(String[] args) {
        int input=5432;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (temp>0)
        {
        birlerBasamagi=temp%10;
        rakamlarToplami+=birlerBasamagi;
        temp/=10;
        }
        System.out.println(rakamlarToplami);
    }

}
