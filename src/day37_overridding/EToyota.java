package day37_overridding;

public class EToyota extends DAraba{

    @Override
    void marka() {
      /*  super.marka();
      Eger hem overridding hem de overridden method'un calismasini
      istersek ilk satira super.marka() yazabiliriz
       */
        System.out.println("Markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
