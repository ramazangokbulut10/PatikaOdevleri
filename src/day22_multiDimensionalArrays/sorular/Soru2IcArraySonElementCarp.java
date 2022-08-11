package day22_multiDimensionalArrays.sorular;

public class Soru2IcArraySonElementCarp {
    public static void main(String[] args) {
        //ic array deki son elementleri carpin

        int[][] arr={{1,2,3},{4,5},{6}};
        int carpim=1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (j==arr[i].length-1) {

                    carpim*=arr[i][j];
                }
            }
        }
        System.out.println(carpim);
    }
}
