package day22_multiDimensionalArrays.sorular;

public class Soru4ArrayElemanTopla {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5},{6,7,8}};
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
            System.out.println(toplam);
            toplam=0;

        }


    }
}
