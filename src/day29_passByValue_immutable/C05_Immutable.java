package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="Mine";

        isim=isim.toUpperCase();//boyle yapinca isim degisir.
        System.out.println(isim);//M�NE


        for (int i = 0; i < 100; i++) {
            isim+=".";

        }
        System.out.println(isim);
    }
}
