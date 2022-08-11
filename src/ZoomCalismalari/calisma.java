package ZoomCalismalari;

public class calisma {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 18.9 ile carp
         *  String de € varsa 19.8 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        double hasilat=0;
        String [][] str={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j].contains("$")) {
                    hasilat+=Double.parseDouble(str[i][j].replaceAll("\\$",""));
                }else {hasilat+=Double.parseDouble(str[i][j].replaceAll("€",""));
                }
            }
            System.out.println(hasilat);
            hasilat=0;
        }


    }
}
