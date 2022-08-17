package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        /*
        String methodlarından "replaceAll" methodu yerini değiştirme methodudur.

        \\s  = tüm boşlukları kapsar.
        \\S  = boşluk dışında her şeyi kapsar
        \\w  = harf ve rakamları kapsar.
        \\W  = harfler ve rakamlar dışında her şeyi kapsar
        \\d  = rakamları kapsar
        \\D  = Rakamlar dışındaki her şeyi kapsar.
         */

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";
        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil
        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        // "qazwsx"
        str=str.replace(" ","qazwsx");//yukardaki str içeriğini düzeltmek için ilk bpşluklarda gitmesin diye
                                                        // geçici bir karakterlerden oluşan atama yaptık
                                                        //1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el
        System.out.println(str);
        str=str.replaceAll("\\W","");//harfler ve rakamlar dışındaki herşeyi "" yapar.
        System.out.println(str+"deneme"); // 1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");// sayıları siler //1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel
        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim
        str=str.replace("qazwsx"," ");
        System.out.println(str);

        System.out.println(str.replaceAll("\\w","*"));
    }
}
