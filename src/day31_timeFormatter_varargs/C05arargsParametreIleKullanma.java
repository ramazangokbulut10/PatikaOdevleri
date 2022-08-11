package day31_timeFormatter_varargs;

public class C05arargsParametreIleKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir(5,"Veli","Mustafa","Ali","Akin");

    }
    //Varargs parmetrelerin sonuncusu olmalidir,varargstan sonra baska parametre olmaz.
    //Bu yuzden bir methodda bir varargs olur
    /*
    Ornekler:
    A.public void moreA(int...nums){}                       +
    B.public void moreB(String values,int...nums){}         +
    C.public void moreC(int... nums,String values){}        -
    D.public void moreD(String... values, int... nums){}    -
    E.public void moreE(String[] values, ...int nums){}     -
    F.public void moreF(String... values, int[]nums){}      -
    G.public void moreG(String[] values,int[] nums){}       +
     */
    private static void enUzunKelimeyiYazdir(int kelimeSayisi,String ... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("En Uzun Kelime: "+enUzunKelime);
    }
}
