package SerbestCalisma;
public class Metindeki_Tekrarlanan_Harfleri_Bul {
    public static void main(String[] args) {
        String str="Javaisalsoeasy";

        tekrarlanan(str);
    }

    private static void tekrarlanan(String str) {
        String harf="";
        String tekrarlar="";

        for (int i = 0; i < str.length(); i++) {    // Java ile hayat guzelmis
            harf=str.substring(i,i+1);
            if(str.substring(i+1).contains(harf)&&!tekrarlar.contains(harf)) {
                tekrarlar+=harf;
                System.out.print(harf+" ");
            }

        }



    }
}
