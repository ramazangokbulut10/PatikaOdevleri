package day09_ternary;

public class Serbest_Calisma {
    public static void main(String[] args) {
        int a=112;
        System.out.println(a>5?"Inek":"Koyun");

        int x=1;
        int y=1;
        int b=x<10?x++:y++;
        System.out.println(x+","+y+","+b);


    }
}
