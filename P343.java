package p300_399;
import java.util.Scanner;


//TLE

public class P343 {

    static char [][] mesa;

    public static int moscasMuertas(int x, int y, int mx, int my){
        int contador = 0;
        for (int i = y; i < y+my; i++) {
            for (int j = x; j < x+mx; j++) {
                if (mesa[i][j] == 'X'){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int mx = sc.nextInt();
        int my = sc.nextInt();

        while (tx !=0){
            int [] soluciones = new int[8];
            mesa = new char[ty][tx];
            for (int i = 0; i < mesa.length; i++) {
               mesa[i] = sc.next().toCharArray();
            }

            for (int i = 0; i <= ty-my; i++) {
                for (int j = 0; j <= tx-mx; j++) {
                    int n = moscasMuertas(j,i,mx, my);
                    if (n  < 8 ){
                        soluciones[n]++;
                    }
                }
            }
            for (int i = 0; i < soluciones.length; i++) {
                System.out.print(soluciones[i] + " ");
            }
            System.out.println();
             tx = sc.nextInt();
             ty = sc.nextInt();
             mx = sc.nextInt();
             my = sc.nextInt();

        }
    }
}
