package day19_scope;

public class C03_ClassVariables {
    public static void main(String[] args) {
        C02_StaticVariables.staticMethod();
        System.out.println(C02_StaticVariables.staticSayi);//C02_StaticVariables clasindaki staticSayi yi cagirabiliriz
        System.out.println(C02_StaticVariables.degersizStaticVar);/*
        degersizStaticVar variablesine herhangi bir deger atanmadigi icin 0 doner
        int -->0
        String -->null
        boolean -->false
        char -->''(hiclik)
        */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10 yazar ama method da  en son degerinin 20 olarak degistirdik

        System.out.println(C02_StaticVariables.staticSayi);//20 yazar

    }
}
