package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Extends keyword kullanilan calss'larda
    ister default const. bulunsun istersek de biz
    yeni constr.lar olusturalim Java constr'in ilk satirina
    super(): const. call yazar

    super(): constr. call default constr.'a benzer
    gorunmesede orada vardir ve calisir ancak biz
    ilk satira farkli bir constr. call yazarsak
    Java super(): constr.'ini siler

    Eger mudahele edip kendi constr. call'umuzu olusturmazsak
    Java'nin default olarak olusturdugu constr. call herzaman
    parametresizdir.  super():
     */

    FMemur(){

        System.out.println("Memur parametresiz constructor");
    }

    FMemur(String isim){
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {


        FMemur mmr1=new FMemur("akin");




    }
}
