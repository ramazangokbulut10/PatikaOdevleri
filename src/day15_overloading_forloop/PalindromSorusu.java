package day15_overloading_forloop;

import java.util.Scanner;

public class PalindromSorusu {
     /*
        Soru 9 ) Interview Question
    Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
    palindrome olup olmadigini kontrol eden bir program yazin.
         */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Bir Kelime Girin palindrome olup olmadığını kontrol edelim : ");
         String kelime= scan.nextLine();

         String tersKelime="";
         for (int i = kelime.length()-1; i >=0 ; i--) {

         tersKelime+=kelime.substring(i,i+1);

         }
         System.out.println(tersKelime);
         if (kelime.equalsIgnoreCase(tersKelime)){
             System.out.println("Girilen kelime Palindrome'dir.");
         }else {
             System.out.println("Girilen kelime Palindrome değildir.");
         }
     }
}
