package day22_multiDimensionalArrays.sorular;

public class Soru1TumElemanCarpimi {

    public static void main(String[] args) {

        //Tum elemanlarinin carpimini yapin

        int[][] arr={{1,2},{6}};
        int carpim=1;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }
        System.out.println(carpim);
    }
}
