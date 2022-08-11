package day13_MethodCreation;

public class C03_StringManipulations {
    public static void main(String[] args) {

        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String input="  Java ogrenmek123 Cok guzel@  ";
        System.out.println(input.startsWith("a",3));

        input=input.trim();
        System.out.println(input);//Java ogrenmek123 Cok guzel@
        input=input.replaceAll("\\d","");
        System.out.println(input);
        input=input.replace("@",".");
        System.out.println(input);
        input=input.replace("C","c");
        System.out.println(input);


    }
}
