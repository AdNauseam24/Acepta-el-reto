package buclesAnidados;
import java.util.Scanner;
//accepted
public class P101 {
    static boolean esDiabolico(int matriz[][]){
        int constMagica=0;
        int sumaHorizontal;
        int sumaVertical;
        int diagonal1=0;
        int diagonal2=0;
        boolean diabolico = true;
        for (int i = 0; i < matriz.length; i++) {
            constMagica+=matriz[0][i];
        }
        for (int i = 0; i < matriz.length; i++) {
            sumaHorizontal=0;
            sumaVertical=0;
            for (int j = 0; j < matriz.length; j++) {
                sumaHorizontal=sumaHorizontal+matriz[i][j];
                sumaVertical= sumaVertical+matriz[j][i];
                if (i==j){
                    diagonal1=diagonal1+matriz[i][j];
                }
                if (i+j==matriz.length-1){
                    diagonal2= diagonal2+matriz[i][j];
                }
            }
            if (sumaHorizontal!=constMagica || sumaVertical!=constMagica){
                diabolico=false;
                return diabolico;
            }

        }
        if (diagonal1!=constMagica || diagonal2!=constMagica){
            diabolico=false;
        }
        return diabolico;
    }
    static boolean esEsoterico(int matriz[][]){
        boolean esoterico = true;
        int cm2;
        int cMagica=0;
        int contadorEsoterico= matriz.length* matriz.length;
        int contador2= contadorEsoterico;
        for (int i = 0; i < matriz.length* matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[j][k]==contadorEsoterico){
                        contadorEsoterico--;
                    }
                }
            }
            if (contadorEsoterico==contador2 && contadorEsoterico!=0){
                return false;
            }
            else {
                contador2=contadorEsoterico;
            }
        }
        if (contadorEsoterico!=0){
            esoterico=false;
            return esoterico;
        }

        for (int i = 0; i < matriz.length; i++) {
            cMagica+=matriz[0][i];
        }
        cm2=(4*cMagica)/ matriz.length;
        if (cm2!=matriz[0][0]+matriz[matriz.length-1][matriz.length-1]+matriz[0][matriz.length-1]+matriz[matriz.length-1][0]){
            esoterico=false;
            return esoterico;
        }
        if (matriz.length%2!=0){
            if (cm2!=matriz[0][matriz.length/2]+matriz[matriz.length/2][matriz.length-1]+matriz[matriz.length-1][matriz.length/2]+matriz[matriz.length/2][0]){
                esoterico=false;
                return esoterico;
            }
            if (cm2!=(matriz[matriz.length/2][matriz.length/2])*4){
                esoterico=false;
                return esoterico;
            }
        }else {
            int sumamedios= matriz[0][matriz.length/2]+matriz[0][(matriz.length/2)-1]+matriz[matriz.length/2][matriz.length-1]+matriz[(matriz.length/2)-1][matriz.length-1]
                    +matriz[matriz.length-1][(matriz.length/2)-1]+matriz[matriz.length-1][matriz.length/2]+matriz[(matriz.length/2)-1][0]+matriz[matriz.length/2][0];
            if (2*cm2!=sumamedios){
                esoterico=false;
                return esoterico;
            }
            if (cm2!=matriz[matriz.length/2][matriz.length/2]+matriz[(matriz.length/2)-1][(matriz.length/2)-1]+matriz[matriz.length/2][(matriz.length/2)-1]+matriz[(matriz.length/2)-1][matriz.length/2]){
                esoterico=false;
                return esoterico;
            }
        }


        return esoterico;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            int [][] matriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j]= sc.nextInt();
                }
            }
            if (esDiabolico(matriz)){
                if (esEsoterico(matriz)){
                    System.out.println("ESOTERICO");
                } else {
                    System.out.println("DIABOLICO");
                }
            }else {
                System.out.println("NO");
            }
            n = sc.nextInt();
        }
    }
}
