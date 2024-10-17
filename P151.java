package buclesAnidados;
import java.util.Scanner;
//accepted
public class P151 {
    static boolean esIdentidad(int [][]matriz){
        boolean resultado = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if((i==j && matriz[i][j]!=1) || (i!=j && matriz[i][j]!=0)){
                    resultado = false;
                    break;
                }
            }
            if(resultado == false){
                break;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        while (tamanio > 0) {
            int [][] matriz = new int[tamanio][tamanio];
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            if (esIdentidad(matriz)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            tamanio = sc.nextInt();
        }
    }
}
