package day38_exceptions;

import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        String[] urunler={"Nutella","Cokokrem","Sut","Findik"};
        Scanner scan=new Scanner(System.in);
        System.out.print("Istediginiz urunun sira no'sunu giriniz : ");


        String istenenSira="";
        while (true) {
            int siraNo = 0;
            try {
                istenenSira = scan.nextLine();
                siraNo = Integer.parseInt(istenenSira);

            } catch (Exception e) {

            }

            if (siraNo > urunler.length && siraNo <= 0) {
                System.out.println("lutfen listeden bir urun seciniz");
            } else {
                try {
                    System.out.println("istene urun : " + urunler[siraNo - 1]);
                    break;
                } catch (Exception e) {
                    System.out.println("girilen index degeri hatali");

                }
            }
        }
    }
}
