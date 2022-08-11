package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    /*
    Interface bir class degildir.

    Abstract class'lar Java'da Abstraction (soyutlastirma/Kural koyma)
    islevini yapiyordu.Ancak abstract bir class'da abstract olmayan
    methodlar da olabilir.Bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concerete method olmasin dedigimiz
    bir class olusturmak istiyorsaniz bunu class degil interface yapmalisiniz

    1- INTERFACE'LER DE CONCERETE METHOD OLMAZ.

    2- Interface'ler full abstraction yaptigin'dan Interface'lerden obje olusturulamaz

    Hatirladigimiz gibi interface olan List'den direk obje olusturamiyorduk.
    Bunun yerine constructor'i list'in child'i olan ArrayList'den seceriz.
    List<String> liste = new ArrayList<>();

    3- Class'larda bir child birden fazla parent edinemez
        Ancak Interface'lerde concrete method olmadigindan biz
        her method'u child class'dan override etmek zorundayiz
        Override ederken kimin soyledigini override ettigimizin onemi yok.

    4- Interface'ler neyin yapilmasi gerektigini soyler
        ama nasil yapilacagina karismaz.


     */
    int SAYI=30;
    String ISIM="Yildiz Koleji";





}
