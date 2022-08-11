package day19_scope;

public class C01_InstanceVariables {
// class icerisinde her yerden variable leri erismek istedigimizde burada(Class level'da) olustururuz
int rakam=20;//sadece static olmayan(instance/object variable) variable olduğu için instance olan methodlarda kullanilir

    public static void main(String[] args)
    {
//--------------------------------------------------------------------------------------------------------------
        int sayi=10;        // local variable(sadece burada gecerlidir)
//--------------------------------------------------------------------------------------------------------------
        //rakam=0;  (instance variable oldugu icin static siniflarda direk cagiramazsiniz)

//Obje variable(instance) kullanabilmek icin obje tanimlamayla kullaniriz
        C01_InstanceVariables obje1=new C01_InstanceVariables();

        obje1.rakam=30;     //hatta instance variableyi degistirebiliriz
        System.out.println("Obje1: "+obje1.rakam);//30
//--------------------------------------------------------------------------------------------------------------

//Tekrar yeni bir obje(obje2) olusturdugumuzda instance variable'ni(rakam) cagirdigimizda Class level'deki degeri dondurur.
        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("Obje2: "+obje2.rakam);//20

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("Obje3: "+obje3.rakam);
    }

    public static void staticMethod()
    {
     //   System.out.println(sayi); burada sayi variable kullanilmaz
     //Bir method içerisin de oluşturulan variable sadece o method icerisinde kullanilir.

        // rakam=0;//instance variable oldugu icin burada kullanilmaz

        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println("Obje4"+obje4.rakam);

    }
    public void staticOlmayanethod()
    {
        System.out.println(rakam);//instance variables static olmayanlarda direk kullanilabilir

    }
}

