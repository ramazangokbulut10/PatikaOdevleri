package day19_scope;

public class ClassVariable {

    public static void main(String[] args) {
        //C02_StaticVariables classından static method çağırma
        C02_StaticVariables.staticMethod();

        //C02_StaticVariables classından (static olan)staticSayi variable yi cagirdik
        System.out.println(C02_StaticVariables.staticSayi);

        //C02_StaticVariables classından static olmayan isim vatiable yi cagirdik
        C02_StaticVariables objeIsimVariableIcin=new C02_StaticVariables();
        System.out.println(objeIsimVariableIcin.isim);


    }
}
