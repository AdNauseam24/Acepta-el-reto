package p200_299;
import java.util.Scanner;



//accepted




public class P224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] cortezas = new int[100000];
        int nCortezas = sc.nextInt();
        while (nCortezas!=0){

             for (int i = 0; i < nCortezas; i++) {
                 cortezas[i] = sc.nextInt();
             }
             int indice = nCortezas-1;
             int sumaCortezas = 0;
             boolean sePuede=false;
             int indiceMax=0;
             while (indice >=0){
                 if (cortezas[indice]==sumaCortezas){
                     sePuede=true;
                      indiceMax=indice+1;
                 }
                 sumaCortezas+=cortezas[indice];
                 indice--;
             }
             if (sePuede){
                 System.out.println("SI " + indiceMax);
             } else {
                 System.out.println("NO");
             }
             nCortezas = sc.nextInt();

        }
    }
}
