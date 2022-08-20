package day14_MethodCreation;

public class C04_MethodCReturn {

    // verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip
    // bize bu halini donduren bir method olusturun
    // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

    /*

------------ VOİD YANİ DÖNDÜRÜLMEYEN METHODLAR İLE PRİMİTİVE VE NON PRİMİTİVE DÖNDÜRÜLEN METHODLAR ARASINDAKİ FARKLAR--------------------------

       Void methodda olusturduğumuz methodda System.out.println(); yaparız

       Return methodlarda main methodlarda System.out.println(); yaparız.

     */
    public static void main(String[] args) {

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyIsim); // kalıcı olsun diye bu hale getirdik artık çağırdığımızda E*** B******
        System.out.println(isim+" "+soyIsim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******
  }

    public static String isimGizle(String isim, String soyIsim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        return  isim+" "+soyIsim;  // mutlaka dondurmeliyiz yoksa çalışmaz !
                                   // Void yerinde primitive ve non primitive data türleri varsa döndürüyoruz return :)


    }


}
