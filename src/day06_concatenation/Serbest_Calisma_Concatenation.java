package day06_concatenation;

public class Serbest_Calisma_Concatenation {

    public static void main(String[] args) {

        //CONCATENATION: Strin bir variable'yi + işareti ile yanyana yazdırmadır.
        //String bir ifadenin yanına sayısal bir işlem gelse bile onu Stringe çevirir ve işlem yapılmaz sadece yazılır

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str1);
        System.out.println(""+sayi1+sayi2+" "+str2);


        System.out.println("Methodla yazdırma: "+(str1.concat(str2)));
        System.out.println("Methodla yazdırma: "+(str1.concat(" ").concat(str2)));



    }

}
