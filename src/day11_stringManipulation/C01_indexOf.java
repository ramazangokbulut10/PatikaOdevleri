package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("J"));//0
        System.out.println(str.indexOf("j"));//-1(yani yok)

        System.out.println(str.indexOf('J'));
        System.out.println(str.indexOf('j'));

        System.out.println(str.indexOf("mek"));

        System.out.println(str.indexOf("g",7));//7 ıncı indexten itibaren g harfinin indexini bulur
        System.out.println(str.indexOf("g",6+1));//18


        //yukarıdaki örnekte str de 2. ve 3. e nin indexini bulun
        //2. e yi bulabilmek için 1 in index ine ihtiyacımız var

       int ilkE= str.indexOf("e");
        System.out.println("ilkE: "+ilkE);
       int ikinciE=str.indexOf("e",ilkE+1);
        System.out.println(ikinciE);
        int ucuncuE=str.indexOf("e",ikinciE+1);
        if (ikinciE==-1){
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
