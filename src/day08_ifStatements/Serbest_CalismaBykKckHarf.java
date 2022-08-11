package day08_ifStatements;

import java.util.Scanner;

public class Serbest_CalismaBykKckHarf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Harf Girin : ");
        char girilen_Harf=scan.next().charAt(0);

        System.out.println(girilen_Harf+1-1); //TEST SATIRI!!!
        System.out.println((int)girilen_Harf);//TEST SATIRI!!!
       if ((girilen_Harf>=97)&&(girilen_Harf<=122)) {
            System.out.println("Girilen ilkharf Küçük.");
        }else if ((girilen_Harf>=65)&&(girilen_Harf<=90))
    {
            System.out.println("Girilen ilkharf Büyüktür.");
        }
       else {
           System.out.println("Yanlış Giriş Yaptınız!!!");
       }
    }

}
/*
import java.util.Scanner;
​
public class A36_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char kar=scan.next().charAt(0);
​
        System.out.println((kar>='a'&&kar<='z')?"küçük harf":((kar>='A'&&kar<='Z')?"büyük harf":"girdiğiniz karekter harf deği"));

 */