package day40_final;

final public class B extends A{
    public static void main(String[] args) {
       B obj=new B();
        System.out.println(A.OKUL.toUpperCase());//YILDIZ KOLEJI
        obj.isim="Alp";
        System.out.println(A.OKUL);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        /*
        Bir class final olarak isaretlenirse o class inherit edilemez
         */


    }
}
