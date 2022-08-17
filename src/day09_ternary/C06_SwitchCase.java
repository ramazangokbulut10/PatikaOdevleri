package day09_ternary;

public class    C06_SwitchCase {
    public static void main(String[] args) {

        //Farklı girişler de aynı Çıktıyı verme örneği

        //Gün isimin alın 'Hafta içi'-'Hafta sonu' yazdırın

        String input = "PERŞEMBE";
        input = input.toLowerCase();

        switch (input) {
            case "pazartesi":
            case "sali":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");//Diğer hafta içi günlerinde aynı çıktıyı alacağımız için enson aynı
                break;                          //çıktıyı veren cuma gününde sout yapıyoruz.break yazmazsak break görünceye
            case "cumartesi":                   //kadar bütün diğer çıktıları da yazacağı için break yazıyoruz
            case "pazar":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");//Yukarıdaki seçeneklerin dışında birşey girildiğinde
                //bu satır devreye giriyor


        }



    }
}
