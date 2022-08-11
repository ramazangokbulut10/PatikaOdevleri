package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println( ogr1.getIsim().charAt(0));//T
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
        Ogretmen ogr2=new Ogretmen();
        ogr2.setIsim("Akin");
        ogr2.setSoyisim("Alkan");
        ogr2.setBrans("Matematik");
        System.out.println("Isim : "+ogr2.getIsim()+"\n"+"Soyisim : "+ogr2.getSoyisim()+"\n"+"Brans : "+ogr2.getBrans()+"\n");


    }
}
