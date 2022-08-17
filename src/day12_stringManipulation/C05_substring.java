package day12_stringManipulation;

public class C05_substring {
    public static void main(String[] args) {

        String input="Veli";

        String tersInput=input.substring(3)+  //  i
                input.substring(2,3)+ // l
                input.substring(1,2)+ // e
                input.substring(0,1); // V
        System.out.println(tersInput); // ileV

    }
}
