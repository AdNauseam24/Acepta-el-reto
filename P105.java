package p100_199;
import java.util.Locale;
import java.util.Scanner;




//accepted






public class P105 {
    static String diaSemana(int n){
        switch(n){
            case 0:
                return "EMPATE ";
            case 1:
                    return "MARTES ";
            case 2:
                        return "MIERCOLES ";
            case 3:
                            return "JUEVES ";
            case 4:
                                return "VIERNES ";
            case 5:
                                    return "SABADO ";
            case 6:
                                        return "DOMINGO ";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a = sc.nextDouble();
        while (a>=0){
            double maximo = a;
            double minimo = a;
            int indiceMax=1;
            int indiceMin=1;
            double acumulador=a;
            for (int i =2; i<7; i++){
                a=sc.nextDouble();
                acumulador+=a;
                if (a==maximo){
                    indiceMax=0;
                } else if (a>maximo) {
                    indiceMax=i;
                    maximo=a;
                }
                if (a==minimo){
                    indiceMin=0;
                } else if (a<minimo) {
                    indiceMin=i;
                    minimo=a;
                }
            }
            System.out.println(diaSemana(indiceMax) + diaSemana(indiceMin)+ (a>acumulador/6.0? "SI":"NO"));
            a=sc.nextDouble();
        }
    }
}
