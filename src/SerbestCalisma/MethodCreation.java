package SerbestCalisma;

public class MethodCreation {
    public static void main(String[] args) {

        int input=123;
        sayilariTopla(input);
    }

    private static void sayilariTopla(int input) {


        int birler=input%10;
        int onlar=(input/10)%10;
        int yuzler=input/100;
        System.out.println("Rakanları Toplamı : "+(birler+onlar+yuzler));
    }


}
