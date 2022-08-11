package day15_overloading_forloop;

public class C08_Faktoriyel {

    public static void main(String[] args) {

        //
        int input=3;
        faktoriyelHesaplama(input);


    }

    private static void faktoriyelHesaplama(int input) {
        if (input<0||input>20){
            System.out.println("Verilen sayı için faktoriyel hesaplamaz : ");
        }else if (input==0){
            System.out.println("0! : 1 dir");
        }else {
            int faktoriyel=1;
            for (int i = 1; i <=input; i++) {
            faktoriyel=faktoriyel*i;

            }
            System.out.println(faktoriyel);
        }


    }
}
