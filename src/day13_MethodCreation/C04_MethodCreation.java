package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        /*
              public int myFirstMethod  ()  {}
               1      2       3         4   5
         1)
        public = Access Modifier(erisim düzenleyici) method'a kimlerin eribileceğini belirler. Public halkın malıdır herkes erişir.
        protected = Sadece icinde bulundugu package ve chids classlardan kullanılır.
        default = Sadece icinde bulundugu package'den ulaşılır.
        private = Sadece icinde bulundugu class'lardan ulaşılır.)

        2)
        int : Return Type, methodun ne urettigini ve bize ne döndürdüğünü belirtir.  non primitive ve primitve data türlerinin tamamını kapsar.

        3)
        myFirstMethod : Olusturdugumuz methodun ismidir, bize kalmış ne yaparsak yaparız.
        camelCase zorunludur!

        4)
         () : Methodlarda isimden sonra parantez kullanılır ve gerektiğinde parantez icine parametre
              yazılır. ( Veri Tipleri )
        5)
          Body ( Method Body ) : {} arasında kalan kodlarımızı yazdığımız bölümdür.

          class < package < proje'nin tamamı
          private < default < public
         */
        // Tüm methodları main methoddan çağırırız.
        // Methodları class'ın (sınıfın içerisinde) main methodun dışarısında oluşturacağız.


        //input olarak verlen 2 integer'i toplayıp sonucunu yazdıran
        //bir method oluşturun

        /*
         method 4 adımda olusturulur.
         1. adım method call                                                                                       topla();
         2.adım agrument eklenmesi gerekiyorsa ekleyelim.                                                          topla(10,20);  topla(input1,input2)
         eğer method'un return type voidden farklı olacaksa bir variable olusturup method call assign edelim.
         3.adım method deklarasyonunda degistirilmesi gereken bolumleri degistir.                                  access modifier, return type
         4.adım eğer return type void dışında bir şey ise return keyword'u donecek değeri hesaplamalıyız.
         */

        int input1=10;
        int input2=20;
        topla(input1,input2);
    }
    public static void topla(int input1, int input2) {
        System.out.println("Girilen İki sayının TOPLAMI: "+(input1+input2));

    }
}
