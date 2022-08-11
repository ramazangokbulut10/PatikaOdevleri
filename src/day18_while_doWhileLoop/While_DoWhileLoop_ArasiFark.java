package day18_while_doWhileLoop;

public class While_DoWhileLoop_ArasiFark {

    public static void main(String[] args) {

        //do while ile while arasindaki fark....

        int i=10;

        do {
            System.out.println(i);
            i++;
        }while (i<5);// i 10dan buyuk olmasina ragmen sarti burda kontrol ettigi icin bir kere body i yazdirdi

 //------------------------------------------------------------------------------------------------

        i=10;
        while (i<5){        // i 10 dan buyuk oldugu ve ilk olarak sarti kontrol ettigi için hic bisey yazmadi.
            System.out.println(i);
            i++;
        }

    }

}
