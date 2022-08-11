package SerbestCalisma;

import java.util.Scanner;

public class Methodla_UsAlma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tabani girin :");
        int taban=scan.nextInt();
        System.out.println("Ussu girin : ");
        int us=scan.nextInt();

        System.out.println( UssunuAl(taban,us));
    }

    private static int UssunuAl(int taban, int us) {
        int sayac=taban;
        for (int i=1; i <us ; i++) {
            taban=taban*sayac;

        }
        return (sayac);
    }
}
