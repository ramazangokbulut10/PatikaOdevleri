package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println("sb = " + sb);//sb = Java daha ne yapsin?--->>append sadece sona ekler...!!!
        /*
        sb.appendCodePoint(97);//ascii codu ile ekleme
        System.out.println("sb = " + sb);//sb = Java daha ne yapsin?a

         */
        sb.append("Java",2 ,4);
        System.out.println("sb = " + sb);

        sb.insert(4," her seyi dusunmus,");
        System.out.println("sb = " + sb);//sb = Java her seyi dusunmus, daha ne yapsin?
        //araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(22,"valla valla",5  ,11);
        System.out.println(sb);//Java her seyi dusunmus valla, daha ne yapsin?

        String str=sb.toString().toUpperCase();//JAVA HER SEYI DUSUNMUS VALLA, DAHA NE YAPSIN?
        System.out.println(sb);//Java her seyi dusunmus valla, daha ne yapsin?




    }
}
