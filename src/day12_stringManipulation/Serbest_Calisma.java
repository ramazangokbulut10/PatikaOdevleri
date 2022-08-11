package day12_stringManipulation;

public class Serbest_Calisma {
    public static void main(String[] args) {

        String str="Bu GUn Her Zama n ki gibi Cok GuZELLL";
        System.out.println(str.replace("Zama n","Zaman"));
        System.out.println(str.replace("GuZELLL","Guzel"));

        System.out.println(str.replace("Zama n","Zaman").replace("Cok","Coooook").replace("GuZELLL","Guzel"));

    }
}
