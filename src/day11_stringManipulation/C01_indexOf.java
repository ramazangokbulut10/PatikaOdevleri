package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("J"));//0
        System.out.println(str.indexOf("j"));//-1(yani yok)

        System.out.println(str.indexOf('J')); // 0
        System.out.println(str.indexOf('j')); // -1

        System.out.println(str.indexOf("mek")); // Direkt String'i arar ve  "10"  çıktısı alırız.  İlk harfin indexini verir her zaman.
         // ------------------------  istediğimiz index'ten sonrasını kontrol etmek ------------------------------------------------
        /*
        Eğer istediğimiz index'ten sonrasını kontrol etmek istersek o zaman aynı methodu iki parametreli kullanabilirdik.
         */
        System.out.println(str.indexOf("g",6));// 6'dan itibaren aramaya başlar ve "6'da "g" oldugu icin yazdırır çıktısı "6" olur.
        System.out.println(str.indexOf("g",7));//7 ıncı indexten itibaren g harfinin indexini bulur  çıktısı "18"
        System.out.println(str.indexOf("g",6+1));//18


        //yukarıdaki örnekte str de 2. ve 3. e nin indexini bulun
        //2. e yi bulabilmek için 1 in index ine ihtiyacımız var

       int ilkE= str.indexOf("e");
        System.out.println("ilkE: "+ilkE);
       int ikinciE=str.indexOf("e",ilkE+1); // ilkE'nin indexini girsek yine onu bulur o yüzden +1 dedik.
        System.out.println(ikinciE);
        int ucuncuE=str.indexOf("e",ikinciE+1);
        if (ikinciE==-1){  // indexof'da olmayan bir şey "-1" dönerdi o yüzden "-1" eşitse yoktur demektir. 
            System.out.println("İkinci e yoktur");
        }else {
            System.out.println("İkinci e: "+ikinciE);
            if (ucuncuE==-1){
                System.out.println("Üçüncü e yoktur");
            }else {
                System.out.println("Üçüncü e: "+ucuncuE);

            }
        }



    }
}
