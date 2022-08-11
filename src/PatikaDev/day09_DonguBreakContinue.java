package PatikaDev;

public class day09_DonguBreakContinue {
    public static void main(String[] args) {
        // Continue kullanımı döngüyü sadece 1 kereye mahsur kırar.
        for (int i = 1; i <=10 ; i++) {
            if (i==7 || i==8){
                continue;
            }
            System.out.println(i);
        }
        // 7 ve 8 sayısını kırdık görünmüyor.
    }
}
