public class Printf_Komutlari {
    public static void main(String[] args) {
       int sayi=123;
       String str="Ahmet Bulutluoz";
       double dob =1.0205030456;
        System.out.println(sayi+"-"+str+"-"+dob);
        System.out.printf("sayi:%d,str:%1.10S,dou:%f",sayi,str,dob);
        System.out.printf("\nsayi:%d,str:%10S,dou:%f",sayi,str,dob);
    }
}
