package day19_scope;

public class C02_StaticVariables {

    int abc=10;
    static int staticSayi=10;// bu sekilde assign yapilinca 'staticSayi' her yerde gorulebilir
    String isim="Mehmet";
    int degersizInstanceVariable;

    static int degersizStaticVar;

    public static void main(String[] args) {
       // System.out.println(abc); calismazz
        System.out.println(staticSayi);//10
        staticMethod();//10
        staticSayi=12;
        System.out.println(staticSayi);//12

        staticMethod();//12


        //static olmayan methodu cagirmak icin obje olustururyoruz
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//12
        System.out.println(obje1.isim);//Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0
        staticMethod();//20

    }
    public static void staticMethod(){

        System.out.println(staticSayi);
    }
    public void staticOlmayanMethod(){

        System.out.println(staticSayi);
        staticSayi=20;

    }
}
