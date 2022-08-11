package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable=degistirilemez
        muttable=degistirilebilir

        en meshur immuttable class: String
         */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//Y�LD�Z BANK
        str.toLowerCase();
        System.out.println(str);                //Yildiz Bank

        str.substring(3,5);
        System.out.println(str);                //Yildiz Bank


        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(".");
        System.out.println(sb);

    }
}
