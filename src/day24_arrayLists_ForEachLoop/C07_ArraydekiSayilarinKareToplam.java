package day24_arrayLists_ForEachLoop;

public class C07_ArraydekiSayilarinKareToplam {
    public static void main(String[] args) {

        int [] sayilar={2,3,5};

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each*each;

        }
        System.out.println("Kareler Toplami: "+toplam);
    }
}
