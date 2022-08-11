package day19_scope;

public class InstanceVariable {
    int staticOlmayan=10; //buna instance/object variable denir.

    public static void main(String[] args) {
        //Static Methodlarda instance variable çağırmak için obje oluştururuz.
       InstanceVariable object1=new InstanceVariable();
       System.out.println("Objeyle instance variable :"+object1.staticOlmayan);

       //instance variablenin değerini de değiştirebiliriz.
        object1.staticOlmayan=70;
        System.out.println("instance variablenin deger atama:"+object1.staticOlmayan);


        //aşağıdaki methodları çağıralım
        staticOlanMethod();
        InstanceVariable object3=new InstanceVariable();
        object3.staticOlmayanMethod();
    }
    public static void staticOlanMethod() {
        InstanceVariable object2=new InstanceVariable();
        object2.staticOlmayan=50;
        System.out.println("Static olan Method :"+object2.staticOlmayan);
    }
    public  void staticOlmayanMethod() {
        System.out.println(staticOlmayan);//Static Method değil, kabul etti
        staticOlmayan=45;
        System.out.println("Satatic olmayan Method: "+staticOlmayan);
    }
}
