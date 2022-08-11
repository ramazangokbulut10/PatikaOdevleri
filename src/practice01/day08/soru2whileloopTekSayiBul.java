package practice01.day08;

import java.util.Scanner;

public class soru2whileloopTekSayiBul {
    /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise)
   */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");

        int sayi=scan.nextInt();
        int count=0;
        while (sayi>0){
            if(sayi%2==1){
                System.out.print(sayi+" ");
                count++;
            }
            sayi--;
        }
        System.out.println("count:"+count);
    }
}
