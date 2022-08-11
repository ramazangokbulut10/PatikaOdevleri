package day06_concatenation;

public class Serbest_Calisma_RelationOperators {
    public static void main(String[] args) {

    // ==Cift eşittir işareti/Karşılaştırma(COMPERION) operatörü;

        System.out.println(5+2==7);//5+2 7'ye eşit mi? cevap:true
        System.out.println(5*2==15);//5*2 15'e eşit mi? cevap:false


    // != Eşit değildir işareti;

        System.out.println(5+2!=7);
        System.out.println(5*2!=5);

    //Küçüktür-büyüktür karşılaştırması;

        System.out.println(!(3*5>7));
        System.out.println((3*5>7));

    //-----------------------Conditional Operators---------------------
        //AND Operatörü &&  :

        System.out.println((5+2==7)&&(4+3!=5));//5+2=7 ve 4+3,5'e eşit değil mi? cevap: true
        System.out.println((5+2==2)&&(4+3!=5));//5+2=2 ve 4+3,5'e eşit değil mi? cevap: true


        //OR Operatörü ||  :

        System.out.println((5+2==7)||(4+3!=5));//5+2=7 mi veya 4+3=5 değil mi? cevap:true
        System.out.println((5+2==2)||(4+3!=5));//5+2=2 mi veya 4+3=5 değil mi? cevap:true



    }

}
