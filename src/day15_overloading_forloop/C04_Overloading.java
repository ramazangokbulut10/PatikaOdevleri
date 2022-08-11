package day15_overloading_forloop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5,7);//12
        topla(5.3,7);//12,3
        topla(5.3,3.5);
        topla(5,6.2);//sayi1 integer-sayi2 integer formatında method yok double-double methoduna uydugu için o çalışır
    }

    public static void topla(int sayi1,int sayi2){

        System.out.println("İki integer'in toplamı : "+(sayi1+sayi2));
    }
    /*
    public static void topla(int sayi1,int sayi2){
        System.out.println("İki integer'in toplamı : "+(sayi1+sayi2));
    }
    */
    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ile bir int toplamı : "+(sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("İki double'in toplamı : "+(sayi1+sayi2));

    }
}
