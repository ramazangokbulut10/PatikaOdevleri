package practice01.day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {

        // Initializing Variable  //variable baslangic degeri verme
// To copy the variable's value
// you can declare multiple variables in the same line
// updating a variable

//Bir degisken tanimlayin : x
//Baska bir degiskeni initialize edin : y
//x degiskenini initialize edin
//y degiskenini yeni bir degerle guncelleyin

        int yas = 33;
        double boy = 1.70;
        System.out.println("yas: " + yas);
        System.out.println("boy: " + boy);

        int yasim = 33;
        int enesYas = yasim;

        System.out.println("enesYas = " + enesYas);
        System.out.println("yasim = " + yasim);

        int yil = 2022, ay = 6, gun = 20;
        System.out.println("yil = " + yil);

        yil = 2032;
        System.out.println("update yıl :" + yil);


    }
}
