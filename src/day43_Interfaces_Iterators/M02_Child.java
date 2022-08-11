package day43_Interfaces_Iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface'de abstract olan 3 method'u implement ettigimiz de
    Java itirazi durdurur.
    Sonradan ekledigimiz default vey static keyword ile tanimladigimiz
    methodlari implement etmememiz sorun olusturmadi
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();//static.......Tum arabalarin direksiyonu vardir
        I01_InterfaceBodyOlanMethod.lamba();//Public yok static var
        M02_Child obj=new M02_Child();
        obj.teker();//default.....Tum arabalarin tekeri vardir
        obj.far();//Public yok default var

    }
}
