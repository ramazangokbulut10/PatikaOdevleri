package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
  //input olarak verlen 2 integer i toplayıp sonucunu yazdıran
        //bir method oluşturun

        int input1=10;
        int input2=20;
        topla(input1,input2);
    }
    public static void topla(int input1, int input2) {
        System.out.println("Girilen İki sayının TOPLAMI: "+(input1+input2));

    }
}
