package p100_199;
import java.util.Scanner;




//accepted





public class P123 {
    public static String [] personas = {"yo ", "tu ", "el ", "nosotros ", "vosotros ", "ellos "};
    public static String [] presentePrimera = {"o", "as", "a", "amos", "ais", "an"};
    public static String [] preteritoPrimera = {"e", "aste", "o", "amos", "asteis", "aron"};
    public static String [] futuroPrimera = {"are", "aras", "ara", "aremos", "areis", "aran"};
    public static String [] presenteSegunda = {"o", "es", "e", "emos", "eis", "en"};
    public static String [] preteritoSegunda = {"i", "iste", "io", "imos", "isteis", "ieron"};
    public static String [] futuroSegunda = {"ere", "eras", "era", "eremos", "ereis", "eran"};
    public static String [] presenteTercera = {"o", "es", "e", "imos", "is", "en"};
    public static  String [] preteritoTercera = {"i", "iste", "io", "imos", "isteis", "ieron"};
    public static String [] futuroTercera = {"ire", "iras", "ira", "iremos", "ireis", "iran"};


    public static void primeraConjugacion(char Tiempo, String verbo){
        switch (Tiempo){
            case 'A':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + presentePrimera[i]);
                }
                break;
            case 'P':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + preteritoPrimera[i]);
                }
                break;
            case 'F':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + futuroPrimera[i]);
                }
                break;
        }
    }
    public static void segundaConjugacion(char Tiempo, String verbo){
        switch (Tiempo){
            case 'A':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + presenteSegunda[i]);
                }
                break;
            case 'P':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + preteritoSegunda[i]);
                }
                break;
            case 'F':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + futuroSegunda[i]);
                }
                break;
        }
    }
    public static void terceraConjugacion(char Tiempo, String verbo){
        switch (Tiempo){
            case 'A':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + presenteTercera[i]);
                }
                break;
            case 'P':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + preteritoTercera[i]);
                }
                break;
            case 'F':
                for (int i = 0; i < 6; i++) {
                    System.out.println(personas[i] + verbo + futuroTercera[i]);
                }
                break;
        }
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbo = sc.next();
        char tiempo = sc.next().charAt(0);
        while (tiempo != 'T'){
            char conjugacion = verbo.charAt(verbo.length()-2);
            verbo = verbo.substring(0, verbo.length()-2);

            switch (conjugacion){
                case 'a':
                    primeraConjugacion(tiempo, verbo);
                    break;
                case 'e':
                    segundaConjugacion(tiempo, verbo);
                    break;
                case 'i':
                    terceraConjugacion(tiempo, verbo);
                    break;
            }
             verbo = sc.next();
             tiempo = sc.next().charAt(0);
        }
    }
}
