package day27_staticKeyword.SoruCozumleri;

public class DenemeInstance {
    int incount=0;

    public  void incremet(){
        incount++;
    }

    public static void main(String[] args) {

        DenemeInstance obj1=new DenemeInstance();
        DenemeInstance obj2=new DenemeInstance();
        obj1.incremet();                  //count =1
        obj2.incremet();                  //count =1
        System.out.println("Obj1: incount is= "+obj1.incount);//1
        System.out.println("Obj2: incount is= "+obj2.incount);//1

    }
}
