package PatikaDev;

import java.util.Scanner;

public class day08_İfElseKanBagısıProgramı {
    public static void main(String[] args) {

         // Kan bagısı programı yazabilirsiniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz. ");
        int yas=scan.nextInt();
        System.out.println("Lütfen kilonuzu giriniz.");
        int kilo=scan.nextInt();
        if(yas>=18){
            if(kilo>=50){
                System.out.println("Kan verebilirsiniz.");
            } else {
                System.out.println("Kan veremezsiniz.");
            }
        }else {
            System.out.println("Kan verebilmeniz için yaşınız 18'den büyük aynı zamanda 50 kilodan fazla olmanız gerekir.");
        }

    }
}
