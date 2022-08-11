package day15_overloading_forloop;

public class Soru1 {
    //For loopkullanarak ekrana 10 kez java güzeldir yazdırın
    public static void main(String[] args) {
        String str="Java güzeldir";

        onKezYazdir(str);
    }

    private static void onKezYazdir(String a) {
        for (int i=1;i<=10;i++){
            System.out.println(a);
        }
    }

}
