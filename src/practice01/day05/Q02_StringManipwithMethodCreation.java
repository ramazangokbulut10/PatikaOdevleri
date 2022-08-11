package practice01.day05;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {

    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime Girin");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));
    }

    private static boolean xyzVarmi(String a) {
        if(a.contains("xyz")){
            return true;
        }else {
            return false;
        }


    }
}
