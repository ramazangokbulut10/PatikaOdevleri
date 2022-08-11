package practice01.day08;

public class soru7_Arrays {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */

    public static void main(String[] args) {
        int[] arr={5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        arrMethod(arr,istenenToplam);
    }

    private static void arrMethod(int[] arr, int istenenToplam) {
        for (int i=0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (istenenToplam==arr[i]+arr[j]) {
                    System.out.println(arr[i]+" + "+arr[j]+" = 9");
                }
            }
        }
    }
}
