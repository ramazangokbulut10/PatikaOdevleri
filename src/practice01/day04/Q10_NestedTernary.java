package practice01.day04;

import java.util.Scanner;

public class Q10_NestedTernary {
    public static void main(String[] args) {

        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */


        char finalNotu='A';
        String result=finalNotu=='A'?"Gayet başarılı":finalNotu=='B'?" başarılı":finalNotu=='C'?"Ha gayret":"Diğerleri...";
        System.out.println(result);





    }
}
