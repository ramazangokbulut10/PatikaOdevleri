package day41_abstractClass_Interface;

public class C01Exceptions {
    public static void main(String[] args) {
        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void calis() {

        throw new RuntimeException("Çoook çalış");
        /*
        throw ile kontrollu exception olustururken
        parametre olarak istedigimiz hata mesajini girebiliriz
         */
    }
}

