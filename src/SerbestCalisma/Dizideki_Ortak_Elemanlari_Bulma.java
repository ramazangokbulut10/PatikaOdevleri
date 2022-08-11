package SerbestCalisma;

public class Dizideki_Ortak_Elemanlari_Bulma {
    public static void main(String[] args) {
        int dizi1[]={1,5,4,6,3,9,8};
        int dizi2[]={5,4,6,1,10,2,7};
        int ortakEleman[]=new int[dizi2.length];
        int dizi1DenTut;
        int dizi2DenKarsilastir;


        for (int i = 0; i <dizi1.length ; i++) {
            dizi1DenTut=dizi1[i];
            for (int j = 0; j < dizi2.length ; j++) {
                dizi2DenKarsilastir=dizi2[j];
                if (dizi1DenTut==dizi2DenKarsilastir){
                    System.out.print(ortakEleman[j]=dizi1DenTut);

                }
            }
        }



    }
}
