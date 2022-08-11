package PatikaDev;

public class day08_SwitchCase {
    public static void main(String[] args) {
        /*

        switch(deger){
        case x:
          deger x'e esitse bu kod bloğu çalışacak.
          break;
          case y:
          deger y'e esitse bu kod bloğu çalışacak.
          break;
          default:
           deger hiç bir şeye eşit değilse bu kod bloğu çalışacak.
           }'
         */

        int day = 5;
        if (day == 1) {
            System.out.println("Bugün Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugün Salı");
        } else if (day == 3) {
            System.out.println("Bugün Çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün Perşembe");
        } else if (day == 5) {
            System.out.println("Bugün Cuma");
        } else if (day == 6) {
            System.out.println("Bugün Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugün Pazar");
        } else {
            System.out.println("Lütfen geçerli bir gün giriniz.");
        }

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Lütfen geçerli gün giriniz.");
        }


    }
}
