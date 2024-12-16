package p300_399;
import java.util.Scanner;


//TLE


public class P346 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        while (N != 0){
            int A = sc.nextInt();

            int [] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i]= sc.nextInt();
            }

            int indiceInicial=0;
            int maxNacimientos = 0;

            while (indiceInicial < N){

                int anioInicial = arr[indiceInicial];
                int anioMax = anioInicial+A-1;
                int indiceActual = indiceInicial;
                int maxActual = 0;
                boolean flag = true;

                while (arr[indiceActual] <= anioMax){

                    if (flag && arr[indiceActual] != anioInicial){

                        anioInicial = arr[indiceActual];
                        indiceInicial = indiceActual;
                        flag=false;

                    }

                    maxActual++;
                    indiceActual++;

                    if (indiceActual>= N){
                        indiceInicial = N;
                        break;
                    }
                }

                maxNacimientos = maxNacimientos>maxActual?maxNacimientos:maxActual;
            }

            System.out.println(maxNacimientos);
             N = sc.nextInt();

        }
    }
}
