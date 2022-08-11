package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20' den 50' ye kadar cift sayilari yadiralim
        for (int i = 20; i <=50 ; i++) {
            if (i%2==0)
                System.out.print(i+" ");

        }
        System.out.println("");

        //while ile....

        int temp=20;
        while (temp<=50) {
            if (temp%2==0)
                System.out.print(temp+" ");
            temp++;
        }

    }
}
