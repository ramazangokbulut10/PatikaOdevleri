package day10_StringManipulation;

public class Serbest_Calisma {
    public static void main(String[] args) {
        //0(sıfır) ilk olmak üzere belirtilen sıradaki karakteri çeker
        System.out.println(("Manisa").charAt(2));//n

        //METİNLERİ KARŞILAŞTIRMA
        System.out.println(("Ankara").equals("ANKARA"));//false
        System.out.println(("Ankara").equalsIgnoreCase("ANKARA"));//true

        //Metinde kaç karakter var onu sayar
        System.out.println(("Ankara").length());

        //Metinin son karakterini yazdırmak için ;
        System.out.println(("Ankara").charAt(("Ankara").length()-1));


        String str1="";//hiçlik atanmış
        String str2=null;//değer atanmamış
        System.out.println("Hiçlik değerinin atandığı str değişkeni: "+str1);
        System.out.println("str2 değeri: "+str2);


        System.out.println("ankara".indexOf("k"));//ankara kelimesinin içinde k 2. sıradadır(saymaya 0 dan başlar)




    }
}
