package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
/*
        String toplam="";
        for (int i = 1; i <=5 ; i++) {
            toplam+="* ";
            System.out.println(toplam);
        }

 */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("? ");
            }
            System.out.println("");
        }

    }
}
