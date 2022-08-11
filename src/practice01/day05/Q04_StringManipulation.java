package practice01.day05;

import java.util.Scanner;

public class Q04_StringManipulation {
    /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");

        String kelime=scan.nextLine();
        char ortancaKRK=kelime.charAt((kelime.length()-1)/2);


        if(kelime.length()%2!=0&&kelime.length()>=3){
            System.out.println("ortancaKRK : "+ortancaKRK);
        }

    }
}
