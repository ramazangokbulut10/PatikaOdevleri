package SerbestCalisma;

import java.util.Scanner;

public class Ekok_Ebob {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
       System.out.println("Aralarinda Enter tuşuna basarak 2 sayi girin : ");
       int sayi1=scan.nextInt(),sayi2=scan.nextInt();
       System.out.println("Ebob  : "+Ebob(sayi1,sayi2));
        System.out.println("Ekok : "+sayi1*sayi2/Ebob(sayi1,sayi2));

        System.out.println("Methodla ekok : "+ManuelEkok(sayi1,sayi2));


    }

    private static int ManuelEkok(int sayi1, int sayi2) {
        int ekok=1;
        if (sayi1==sayi2) {
            return sayi1;
        }if (sayi1==0||sayi2==0) {
            return 0;
        }
        else if (sayi1>sayi2){
            for (int i=2;i<sayi1;i++) {
                if (sayi1%i==0){

                    ekok=i*ekok;
                }
            }

        }
        else if(sayi1<sayi2){
            for (int i=2;i<sayi2;i++) {
                if (sayi2%i==0){

                    ekok=i*ekok;
                }
            }
        }return ekok;



    }

    private static int Ebob(int sayi1, int sayi2) {
        int ebob=1;
        for(int i=1;i<=sayi1&&i<=sayi2;i++){
            if(sayi1%i==0&&sayi2%i==0){

                ebob=i;
            }
        }
        return ebob;
    }
}
