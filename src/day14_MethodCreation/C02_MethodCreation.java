package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
//verilen 3 basamaklı bir sayının rakamları toplamını yazdıran bir method oluşturalım.

    int input=455;
    rakamlariTopla(input);
     }
     public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("Girdiğiniz "+temp+" Sayısının Rakamlar Toplamı "+rakamlarToplami);
    }

}
