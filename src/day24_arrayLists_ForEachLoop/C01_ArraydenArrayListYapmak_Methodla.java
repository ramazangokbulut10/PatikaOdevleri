package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak_Methodla {
    public static void main(String[] args) {

        //arraydeki tum elementleri List'e atın.

        String[] arr={"Ismail","Nurullah","Fatih"};

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);

     //   sinifList.add("Mustafa");   //liste yeni element ekleyince hataveriyor
      //  sinifList.remove(1);   //listede birşey silmek istenilince hata veriyor


        sinifList.set(0, "Mahmut");  //listi degistirince array de degisiyor
        System.out.println("List'i degistirince list : "+sinifList);
        System.out.println("List'i degistirince array : "+Arrays.toString(arr));

    }
}
