package day24_arrayLists_ForEachLoop.sorulaar;

public class Q3IkiStringArrOrtakElmBul {

    //Soru 3:
    //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
    //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
    //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

    public static void main(String[] args) {
        String[] arr1={"Mehmet","Hasan","Cafer"};
        String[] arr2={"Mustafa","Ali","Veli"};
        String ortakEleman="";

        for (String each:arr1) {
            for (String each2:arr2) {
                if (each.equalsIgnoreCase(each2)){
                   ortakEleman+=each+" ";
                }

            }

        }if (ortakEleman.isEmpty()){
            System.out.println("Ortak Elamn Yok");
        }
    }

}
