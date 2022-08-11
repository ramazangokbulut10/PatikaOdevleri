package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
//----------------PreIncrement---------------------------------------------

        int num1=9;
        int num2=++num1;   //num1'i arttırır sonra num2'ye atar
        System.out.println("PreIncrement :");
        System.out.println("num1 :"+num1);
        System.out.println("num2 :"+num2);

//----------------PostIncrement---------------------------------------------

        int num3=9;
        int num4=num3++;  //num3'ü num4' eşitler sonra num3'ü 1 arttırır
        System.out.println("PostIncrement :");
        System.out.println("num1 :"+num3);
        System.out.println("num2 :"+num4);


    }
}
