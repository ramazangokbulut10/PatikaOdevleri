package day27_staticKeyword.SoruCozumleri;

public class DenemeStatic {
    static int count=0;

    public  void increment(){
        count++;
    }
    public  static  void main(String[] args){
        DenemeStatic obj1=new DenemeStatic(); //default contrructor kullanarak atnimlama yapilmis
        DenemeStatic obj2=new DenemeStatic(); //default contrructor kullanarak atnimlama yapilmis
        obj1.increment();                          //count =1
        obj2.increment();                          //count =2
        System.out.println("Obj1: count is= "+obj1.count);//2
        System.out.println("Obj2: count is= "+obj2.count);//2







    }
}
