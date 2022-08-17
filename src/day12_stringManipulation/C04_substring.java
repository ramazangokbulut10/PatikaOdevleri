package day12_stringManipulation;

public class C04_substring {
    public static void main(String[] args) {

        String str="Java cok yasa";

        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(5,7));//co
        System.out.println(str.substring(6,6));//"" 6 Hem dahil hem dahil değil diyor hiçlik bırakır.

        //System.out.println(str.substring(6,2));//hata verdi//Run Time Eror(RTE) altını çizmez ama buna denir. Run time error hatasıdır.
                                                //Compile time eror(CTE) yanlış yaptığında da altını çizmesi compile time error hatasıdır.








    }
}
