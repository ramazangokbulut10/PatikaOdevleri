package SerbestCalisma;

import java.util.Scanner;

public class Ekok_Ebob_Akin {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lutfen 1.sayiyi giriniz: ");
    int sayi1 = scan.nextInt();
    System.out.print("Lutfen 2.sayiyi giriniz: ");
    int sayi2 = scan.nextInt();
    System.out.println("obeb = " + obeb(sayi1,sayi2));
    System.out.println("okek = "+ (sayi1*sayi2/obeb(sayi1,sayi2)));

}

        public static int obeb(int sayi1, int sayi2) {
        if(sayi1==0|| sayi2==0)
            return 0;
        if(sayi1==sayi2)
            return sayi1;
        if(sayi1>sayi2)
            return obeb(sayi1-sayi2,sayi2);
        else
            return obeb(sayi1,sayi2-sayi1);
    }
}
