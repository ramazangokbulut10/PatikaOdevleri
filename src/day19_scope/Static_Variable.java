package day19_scope;

public class Static_Variable {
    static  int staticSayi=10;

    public static void main(String[] args) {
        System.out.println(staticSayi);

        //Methodları Çağıralım:
        staticMethod();
        Static_Variable obje1=new Static_Variable();
        obje1.staticOlmayanMethod();
    }
    public static void staticMethod(){
        staticSayi=50;
        System.out.println(staticSayi);
    }
    public  void staticOlmayanMethod(){

        System.out.println(staticSayi);

    }
}
