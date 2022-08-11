package day12_stringManipulation;

public class Serbest_Calisma2 {
    public static void main(String[] args) {

        String str="Mustafa SAK Manisa Kirkagac Manisa";
        System.out.println(str.replaceAll("Manisa","Izmir"));

//------------------------------------------------------------------------------------------------------

        String str1="Mustafa SAK Manisa Kirkagac";
        System.out.println(str1.replaceAll("\\w","*"));//bütün harfleri(word) * yapar//******* *** ****** ********

        String str2="23Mus+ta+fa SAK-- Man-isa Kirk--agac+-/";
        System.out.println(str2.replaceAll("\\W",""));//harf ve rakamlar dışındaki herşeyi "" yapar//23MustafaSAKManisaKirkagac

//------------------------------------------------------------------------------------------------------

        String str3="3423Mustafa SAK Manisa Kirkaga3c";//HARFLER dışındaki herşeyi "" yapar//Mustafa SAK Manisa Kirkagac
        System.out.println(str3.replaceAll("\\d",""));

        String str4="3423Musta+fa SAK Mani+sa Kirkaga/+-3c";//Sadece RAKAMLAR kalır diğerlerini "" yapar
        System.out.println(str3.replaceAll("\\D",""));

        String str5=" M U S T A F A     S A K";
        System.out.println(str5.replaceAll("\\s",""));//bütün boşlukları siler/MUSTAFASAK

        String str6=" M U S T A F A     S A K";
        System.out.println(str6.replaceAll("\\S",""));//boşluların dışındaki herşeyi "" yapar/ ekrançıktısı
        System.out.println("deneme");

    }
}
