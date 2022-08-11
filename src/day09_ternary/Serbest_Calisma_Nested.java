package day09_ternary;

public class Serbest_Calisma_Nested {
    public static void main(String[] args) {

        String input="1";
        input=input.toLowerCase();
        switch (input) {

            case "1":
                System.out.println("Böyle Gün YOĞĞ");
                break;
            case "CUMA":
                System.out.println("CUMA");
                break;
            case "PAZAR":
                System.out.println("Günlerden Pazar");
                break;
            default:
                System.out.println("Hiçbirine uymadı");



        }
    }
}
