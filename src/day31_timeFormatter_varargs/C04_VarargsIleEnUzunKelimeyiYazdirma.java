package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Veli","Mustafa");

    }
    private static void enUzunKelimeyiYazdir(String ... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("En Uzun Kelime: "+enUzunKelime);
    }

}
