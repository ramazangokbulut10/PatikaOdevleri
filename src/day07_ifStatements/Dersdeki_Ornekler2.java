package day07_ifStatements;

import java.util.Scanner;

public class Dersdeki_Ornekler2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir Günün İlk harfini Girin: ");
        char gunIlkHarf=scan.next().charAt(0);
        if ((gunIlkHarf=='P')||(gunIlkHarf=='p'))
        {
            System.out.println("Pazartesi,Perşembe,Pazar");
        }
        else if ((gunIlkHarf=='S')||(gunIlkHarf=='s'))
        {
            System.out.println("Salı");
        }
        else if ((gunIlkHarf=='Ç')||(gunIlkHarf=='ç'))
        {
            System.out.println("Çarşamba");
        }
        else {
            System.out.println("Cuma,Cumartesi");
        }


    }
}
