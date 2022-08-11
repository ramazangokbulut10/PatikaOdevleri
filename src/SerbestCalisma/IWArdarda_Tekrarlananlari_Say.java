package SerbestCalisma;

public class IWArdarda_Tekrarlananlari_Say {
    public static void main(String[] args) {
     /* Interview sorusu...
        Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
        (Büyük harf-küçük harf ayrımına dikkat ediniz)
        Test data:
        Input = AAABBCDD  ( Tekrarlanan harfler yan yana olacak, stringin devamında başka bir yerde olmayacak )
        output = A3B2C1D2
                */

        String input="AAAQQQAAADDDSSSSASSS";
        frekans(input);
    }

    private static void frekans(String input) {
        int kontrol=1;
        String harf="";
        String tekrarHarfi="";
        for (int i = 0; i <input.length() ; i++) {
         harf=input.substring(i,i+1);


            for (int j =i+1 ; j < input.length(); j++) {
                tekrarHarfi=input.substring(j,j+1);
                if (harf.equals(tekrarHarfi)){
                    kontrol++;
                    i++;
                }else j=input.length();
            }
            System.out.print(harf+kontrol);
            kontrol=1;
        }
    }

}
