package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<Integer>();
        List<Integer> sayilar2=new ArrayList<>();

//---------------------------List'e eleman ekleme kodu (Listadi.add(eklenecekeleman))---------------------------------------------------------------------
        sayilar1.add(5);        //List'e element ekleme kodu
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println("3 element eklendikten sonra liste:"+sayilar1);

        sayilar2.add(2);
        sayilar2.add(3);
        sayilar2.add(5);
        sayilar2.add(6);
        sayilar2.add(2,4);
        System.out.println("Kaykilma yaptilan list:"+sayilar2);

//--------------------------------List'in boyutuna Bakma kodu (Listadi.size())----------------------------------------------------------------

        System.out.println("Listenin Boyutu :"+sayilar1.size());//List'in boyutunu getirir(size)
        sayilar1.add(2);

//-----------------------------List'e baska List ekleme(Listadi.addAll(eklenecekListadi))-----------------------------------------------------------------

        sayilar1.addAll(sayilar1);//sayilar1'e baska List'i(sayilar1) ekleme
        System.out.println(sayilar1);       //[5, 3, 2, 2, 5, 3, 2, 2]

//------------------------------------------------------------------------------------------------

        System.out.println("Listenin yeni boyutu :"+sayilar1.size()); //Listenin yeni boyutu :8

//-----------------------------------SET Kodu-------------------------------------------------------------
        sayilar1.set(2,8);  //2. index dekini 8 yapar.
        System.out.println(sayilar1);       //[5, 3, 8, 2, 5, 3, 2, 2]
    }
}
