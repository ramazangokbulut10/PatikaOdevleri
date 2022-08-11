package day17_nestedForLoop;

public class C04_NestedForLoop {
    /*
    verilen input'a gore *'lardan olusan bir ucgen olusturn

    ornek input=4 ise
    *
    * *
    * * *
    * * * *

     */
    public static void main(String[] args) {
        //outer loop dışdaki
        for (int i = 1; i <=4;i++) {
            //inner loop icdeki
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println(" ");

        }
    }

}
