package day17_nestedForLoop;

import java.util.Scanner;

public class deneme {



    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);

    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */
        String islemler = """
                1. Toplama İşlemi
                2. Çıkarma İşlemi
                3. Çarpma İşlemi
                4. Bölme İşlemi
                Çıkış için q'ya basın.""";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");
        label:
        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            switch (islem) {
                case "q":

                    System.out.println("Programdan Çıkılıyor...");
                    break label;
                case "1": {
                    System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");

                    int kacsayi = scanner.nextInt();

                    switch (kacsayi) {
                        case 2 -> {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.print("b:");
                            int b = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Girilen sayıların toplamları : " + (toplama(a, b)));


                            break;
                        }
                        case 3 -> {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.print("b:");
                            int b = scanner.nextInt();
                            System.out.print("c:");
                            int c = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Girilen sayıların toplamları : " + (toplama(a, b, c)));

                            break;
                        }
                        default -> System.out.println("Bunun için uygun metod bulunmuyor...");
                    }


                    break;
                }
                case "2": {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen Sayıları Farkları : " + cikarma(a, b));

                    break;
                }
                case "3": {
                    System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");

                    int kacsayi = scanner.nextInt();

                    switch (kacsayi) {
                        case 2 -> {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.print("b:");
                            int b = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b)));


                            break;
                        }
                        case 3 -> {
                            System.out.print("a:");
                            int a = scanner.nextInt();
                            System.out.print("b:");
                            int b = scanner.nextInt();
                            System.out.print("c:");
                            int c = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b, c)));

                            break;
                        }
                        default -> System.out.println("Bunun için uygun metod bulunmuyor...");
                    }

                    break;
                }
                case "4": {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen Sayıların Bölümü : " + bolme(a, b));

                    break;
                }
                default:
                    System.out.println("Geçersiz İşlem...");
                    break;
            }


        }


    }
}
