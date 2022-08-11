package day31_timeFormatter_varargs;

public class Varargs_Sorusu {
    public static void main(String[] args) {
        new  Varargs_Sorusu().Varargs_Sorusu(1,"hello");
        new  Varargs_Sorusu().Varargs_Sorusu(2,"hello","hi");
    }
    public void Varargs_Sorusu(int x,String... y){//NOT:Varargs olarak tanimlanan y yi array oldugunu unutma!!!
        System.out.print(y[y.length-x]+" ");
    }

}
