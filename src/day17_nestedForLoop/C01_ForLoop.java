package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String deki kullanilan harflari
        //tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yazdirin.

        String input="Java her zaman guzel";

        tekrarsizYap(input);

    }

    private static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");//Javaherzamanguzel
        System.out.println(islenecekKelime);                                //Javaherzamanguzel

        System.out.print(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length() ; i++) {

        if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
            System.out.print(","+islenecekKelime.substring(i,i+1));
            benzersizInput+=islenecekKelime.substring(i,i+1);
        }
        }
        System.out.println("\n   "+benzersizInput);
    }
}
