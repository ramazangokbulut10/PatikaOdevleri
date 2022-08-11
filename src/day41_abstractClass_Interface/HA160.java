package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

/*
    Abstract parent silsilesinden gelen ilk concerete
     class parent'i olan tum class'lardaki abstract methodlari
     concrete hale donusturmek (override) ZORUNDADIR

     Bu kuralin istisnasi parent class'lardan
     herhangi birinde concerete hale donusturulmus abstract methodlardir
 */
public static void main(String[] args) {
    HA160 arb1=new HA160();
    //concerete bir class'dan istedigimiz objeyi uretebiliriz
    FMercedes arb2=new FMercedes();
    //mercedes'de concerete

    EToyota arb3=new GCorolla();

    /*
    Abstract class'lar constructor barindirir ama obje uretemezler
    Toyota class'i abstract class oldugundan obje uretilemez
     */

    /*
    List<String> list1=new List<String>();

    List<String> list2=new ArrayList<>();

    Abstract bir class'in ozelliklerini tasiyan
    bir obje olusturmak istedigimiz de
    data turunu istedigimiz abstract class, constructor'i ise
    child'i olan concerete bir class'dan seceriz
     */



}
}
