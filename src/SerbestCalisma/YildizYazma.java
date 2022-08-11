package SerbestCalisma;

public class YildizYazma {

    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        //yan yana 3 tane * yaz

     //  for (int i = 1; i <= 3; i++) {
     //      System.out.print("* ");
     //  }
     //  // yan yana 4 * yazin
     //  System.out.println("");
     //  for (int i = 1; i <= 4; i++) {
     //      System.out.print("* ");
     //  }
     //  System.out.println("");

        // Bu tur durumlarda ic ice (Nested) loop kullanmak gerekir

        for (int i = 1; i<=5; i++){
            for (int j =1; j<=i; j++){
                System.out.print("* ");
            }
           System.out.println("");

        }
    }
}





