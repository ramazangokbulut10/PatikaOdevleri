package day12_stringManipulation;

public class Serbest_substring {
    public static void main(String[] args) {

        String isim="Mustafa";
        String soyIsim="SAK";
        String kartNo="1234 1234 1234 1234";

        //isim variablesinin ilk harfini büyük yazıp diğerlerini * yazdırma kodu

       String isimIlkHarf=isim.toUpperCase().substring(0,1);
        //System.out.println(isimIlkHarf);
        String isimGeriyeKalanlar=isim.substring(1);
       // System.out.println(isimGeriyeKalanlar);
        System.out.println(isimIlkHarf+isimGeriyeKalanlar.replaceAll("\\w","*"));

        //yukarıdaki kodları tek satırda yapmak için;
        System.out.println(isim.toUpperCase().substring(0,1)+
                            isim.replaceAll("\\w","*").substring(1));
//-----------------------------------------------------------------------------------------------
        //isim variablesinin ilk harfini büyük yazıp diğerlerini * yazdırma kodu

        System.out.println(soyIsim.substring(0,1)+
                soyIsim.replaceAll("\\w","*").substring(1));

//------------------------------------------------------------------------------------------------

        //kartNo variablesinin ilk 4 rakamını yazıp diğerlerini * yazdırma kodu

        System.out.println(kartNo.substring(0,4)+" **** **** ****");





    }
}
