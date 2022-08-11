package day29_passByValue_immutable;

public class C055_Immutable_Tekrar {
    public static void main(String[] args) {
        String str="Java Candir";
        str.toLowerCase();
        str.replace("Java","C#");
        str.substring(0,2);
        System.out.println(str);//5,6,7,8. satirlarda str variblesi ile ilgili ne kadar degisiklik yapsakta String Class'i
                                //immutible oldugu icin degesikler kalici olmaz

        StringBuilder strb=new StringBuilder();
        strb.append("Mustafa");
        System.out.println(strb);
        strb.append("Poyraz");
        System.out.println(strb);
    }
}
