package day04_dataCasting;

public class Serbest_Calisma {
    public static void main(String[] args) {

        int sayi1=(int)7.3;
        System.out.println(sayi1);//7 yazar

        char harf='a';
        char yeniHarf=(char)(harf+1);//97+1
        System.out.println(yeniHarf);

        char harf2=98;
        System.out.println(harf2);

        int sayi3='c'; // cnin ASCII tablosundaki değerini yazar
        System.out.println(sayi3);

        int a=23,b=5;
        double sonuc=(double)(a)/(b);//sayıladan birini double yapınca geniş olana göre amel eder
        System.out.println(sonuc);

        int x=129;
        byte y= (byte) x;
        System.out.println(y);
//---------------------Increment/Bir Variable'in Değerini Arttırma Yöntemleri--------------------------------------------------------------------------
        int numA=2;
        numA+=5;
        System.out.println("numA+=5(numA=numA+5) = "+numA);

        int numB=10;
        numB*=7;
        System.out.println("numB*=7(numB=numB*7) = "+numB);

        int numC=7;
        numC++;
        System.out.println("numC++(numC=numC+1) = "+numC);
//---------------------Decrement/Bir Variable'in Değerini Azaltma Yöntemleri--------------------------------------------------------------------------

        int numAA=2;
        numAA-=3;
        System.out.println("numAA-=3 = "+numAA);

        int numBB=20;
        numBB/=5;
        System.out.println("numBB/=5 = "+numBB);

        int numCC=11;
        numCC--;
        System.out.println("numCC-- = "+numCC);


    }
}
