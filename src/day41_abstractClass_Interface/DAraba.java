package day41_abstractClass_Interface;

public abstract class DAraba {
     public  static void main(String[] args) {
        /*Abstract class'da main method opsiyoneldir
        Eger abstract class sadece child class'larin
        tasimak zorunda oldugu ozellikleri belirlemek
        icin olusturulduysa mani methoda ihtiyac olmaz
        sadece abstract method'lar olur

        Bir abstract method'da standart belirlemek disinda
        method'lar calisabilir.
        Bu durumda ihtiyac olursa main method olusturulabilir
         */

    }
    protected abstract void motor();
    protected abstract void yakit();
    protected abstract void kaporta();
     /*
     Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen
     methodlar abstract method olur ve abstract methodlarin body'si olmaz
      */
    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        Abstract olmayan method'lara concrete method denir
        Abstract bir method'u abstract keyword ile
        belirtmek zorunludur.

        Concrete methodlarda bunun deklare edilmesine gerek yoktur
        Biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan methodlardan bahsetmek icin
        concrete tabirini kullaniriz
         */
    }


}
