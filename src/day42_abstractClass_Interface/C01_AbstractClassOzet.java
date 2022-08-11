package day42_abstractClass_Interface;

public class C01_AbstractClassOzet {
    /*
    1-Bir class'i abstract yapip yapmamaya bastan karar veririz
    Eger bir class'tan obje olusturmayacaksak o class'i
    child class'larinin uymasi gereken kurallari belirleyecek sekilde
    dizayn etmek  istiyorsak abstract class yapariz

    2-Abstract bir class'da child class'larin mutlaka
    uymasi gereken kurallari  abstract methodlar ile belirleriz.
    Abstract methodlar mutlaka child class'da override edilecegi icin
    method body'ye ihtiyac duymaz

    3-Abstract olarak tanimlanan methodlarin body'si olmaz

    4-Abstract class zincirinden sonra gelen ilk concerete class,
    parent'larinda bulunan ve concerete olmayan
    tum methodlari override etmek zorundadir.Ancak parent abstract
     class'larda bulunan concerete methodlari override etmek zorunda degildir.

    5- Abstract bir class'in abstract child'i parent'daki
    abstract methodlari override etmek zorunda degildir

    6- Abstract class'lar constructor'a sahiptir fakat
     abstract class'lardan OBJE olusturulamaz

     7- Abstract class'lar final yada private olarak tanimlanamaz
      */



}
