package day18_while_doWhileLoop;

public class TumLooplarla_C01 {
    public static void main(String[] args) {
        /*
        kullanıcıdan baslangıc bitis harfi alın
        baslangic harfinden bitis harfine kadar olan butun harfleri siralayin
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        System.out.println("while loop ile yapilan : ");
        while (temp<=sonHarf) {

            System.out.print((temp+" ").toUpperCase());
            temp++;
        }


        //for loop la yapalım:

        System.out.println(" ");
        System.out.println("For Loop la yapilan : ");
        for (char i = 'f'; i <=sonHarf ; i++) {

            System.out.print((i+" ").toUpperCase());
        }


        //do while loop la yapalim:
        System.out.println(" ");
        System.out.println("do while loop ile yapilan : ");
        temp=ilkHarf;
        do {
            System.out.print((temp+" ").toUpperCase());
            temp++;
        }while (temp<=sonHarf);


    }
}
