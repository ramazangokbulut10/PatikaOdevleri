package day27_staticKeyword.SoruCozumleri;

public class ZorSoru {

    int x;
    static int y;
    ZorSoru(int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new ZorSoru(2);
        ZorSoru zor=new ZorSoru(3);
        System.out.println(zor.x+","+zor.y);
    }
}
