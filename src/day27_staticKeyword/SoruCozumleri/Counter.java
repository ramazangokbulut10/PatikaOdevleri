package day27_staticKeyword.SoruCozumleri;

public class Counter {
    int count;
    static int stCounter;
    public Counter(){
        count++;
        stCounter++;
    }
    public int getCounter(){
        return count;
    }
    public static int getStCounter(){
        return stCounter;
    }

    public static void main(String[] args) {
        Counter cs1=new Counter();
        Counter cs2=new Counter();
        Counter cs3=new Counter();
        Counter cs4=new Counter();
        Counter cs5=new Counter();
        Counter cs6=new Counter();
        System.out.println("count is: "+cs6.getCounter());  //count is: 1
        System.out.println("stCounter is: "+cs6.getStCounter());    //stCounter is: 6
    }
}
