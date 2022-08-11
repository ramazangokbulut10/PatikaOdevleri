package day04_dataCasting;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=sayi1+1;  //  sayi2-->11

        sayi2+=5;  // sayi2-->16

        /*
        pre veya post increment/decrement
        sadece ++ ve -- işlemi için geçerlidir
        bu iki işlem sayidan önce veya sonra yazılmasına göre farklı iki işleyiş olur
         */
        int sayi3=sayi2++; // 1- sayi2 bir arttırılacak
                           // 2- sayi2 değeri, sayi3'e atanacak

        int sayi4=++sayi1;  // 1- sayi1 bir arttırılacak
                            // 2- sayi1 degeri, sayi4'e atanacak
        System.out.println(sayi3);
        System.out.println(sayi4);
    }

}
