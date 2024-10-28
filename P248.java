package p200_299;
import java.util.Scanner;


//accepted



public class P248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beneficioMax;
        int i;
        int beneficioActual;
        int sumaBruto;
        int maximaFinalizacion;
        int maximoComienzo;
        int minimoBruto;

        int ciclos = sc.nextInt();


        while (ciclos!=0){
            beneficioMax=0;
            beneficioActual=0;
            minimoBruto=0;
            maximoComienzo=0;
            sumaBruto=0;
            int jugadas;
            for ( i = 0; i < ciclos; i++) {
                jugadas= sc.nextInt();
                sumaBruto+=jugadas;
                minimoBruto=Math.min(minimoBruto,sumaBruto);
                maximoComienzo=Math.max(maximoComienzo,sumaBruto);
                beneficioActual+=jugadas;
                if (beneficioActual<0)beneficioActual=0;
                beneficioMax=Math.max(beneficioMax,beneficioActual);
            }
            maximaFinalizacion=sumaBruto-minimoBruto;
            System.out.println(Math.max(maximaFinalizacion+maximoComienzo,beneficioMax));
            ciclos = sc.nextInt();
        }
    }
}
