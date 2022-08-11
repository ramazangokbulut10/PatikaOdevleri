package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfstatements {
    public static void main(String[] args) {

        //Girilen Nota göre Harf Notu verme Sorusu:

        Scanner scan=new Scanner(System.in);
        System.out.println("100 üzerinden NOT girişi yapın:");
        double note=scan.nextDouble();
        if (note<0 || note>100)
        {
            System.out.println("Lütfen geçerli bir not girin");
        }
        else if (note<50) {
            System.out.println("Notunuz Harfi \'D\' dir");
        }
        else if (note<=60)
        {
            System.out.println("Notunuzun Harfi \'C\' dir");
        }
        else if (note<=80)
        {
            System.out.println("Notunuzun Harfi \'B\' dir");
        }
        else {
            System.out.println("Notunuzun Harfi \'A\' dır");
        }

    }
}
