package p100_199;
import java.util.Arrays;
import java.util.Scanner;



//accepted




public class P120 {
    static int[][] crearMatriz(int lado, int n){
        int x = lado/2;
        int y = 0;
        int xAnterior;
        int yAnterior;
        int [][] matriz = new int[lado][lado];
        for (int[] row : matriz) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < lado*lado; i++) {
            matriz[x][y]=n;
            xAnterior=x;
            yAnterior=y;
            n++;
            y--;
            if (y<0){
                y=lado-1;
            }
            x++;
            if (x>=lado){
                x=0;
            }
            if (matriz[x][y]!=-1){
                x=xAnterior;
                y=yAnterior+1;
            }

        }
        return matriz;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while (n!=0 || k!=0){
            int acumulador = 0;
            int [][] matriz =  crearMatriz(n,k);
            for (int i = 0; i < n; i++) {
                acumulador+=matriz[i][i];
            }
            System.out.println(acumulador);
            n = sc.nextInt();
            k = sc.nextInt();

        }

    }
}
