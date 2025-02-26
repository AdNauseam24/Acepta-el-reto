package p100_199;
import java.util.Scanner;

//accepted



public class P176 {
    static char[][] matriz;


    public static boolean contarMinas(int i, int j){
        int minas  = 0;

        for (int k=Math.max(0, i-1); k < Math.min(matriz.length, i+2); k++) {
            for (int m=Math.max(0, j-1); m < Math.min(matriz[k].length, j+2); m++) {
                if (matriz[k][m] == '*') {
                    minas++;
                }
            }
        }

        return  minas>5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        while (a!=0 && b!=0){
            int contador = 0;

              matriz = new char[b][a];
            for (int i=0; i < b; i++) {
                String lineaEntrada = sc.next();
                for (int j=0; j < a; j++) {
                    matriz[i][j] = lineaEntrada.charAt(j);
                }
            }
            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    if (matriz[i][j]=='-' && contarMinas(i,j)){
                        contador++;
                    }
                }
            }
            System.out.println(contador);
            a=sc.nextInt();
            b=sc.nextInt();
        }
    }
}
