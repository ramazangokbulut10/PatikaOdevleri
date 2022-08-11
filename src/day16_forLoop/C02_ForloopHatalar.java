package day16_forLoop;

public class C02_ForloopHatalar {
    public static void main(String[] args) {
/*bu sonsuz loop tur ve çalışsa hata vermez ama sonsuza kadar yazar

        for (int i = 0; i >-10;i++){
            System.out.println(i);
        }

 */
        //for loop çalışır
        //ama loop body si hiç bir zaman devreye girmez(çalışmaz)
        for (int i=0;i>5;i++){
            System.out.println(i);
        }
    }
}
