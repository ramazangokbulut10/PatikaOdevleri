package day37_overridding;

public class Parent extends Grand {
    @Override
    void sakal(int sayi) {
        System.out.println("baba sakal-1//dede overridding//");
    }

   public void sakal(String str){
        System.out.println("baba sakal-2 //overloading//");
    }
}
