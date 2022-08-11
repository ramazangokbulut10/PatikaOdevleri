package day26_constructor.SoruCozumleri;

public class MyConstructor2 {
    int x=3;
    int y=5;
    MyConstructor2(){
        x+=1;
        System.out.println("-x"+x);
    }
    MyConstructor2(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-x"+x);
    }
    MyConstructor2(int i,int i2){
        this(3);
        this.x-=4;
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        MyConstructor2 mc1=new MyConstructor2(4,3);
    }
}
