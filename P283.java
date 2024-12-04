package p200_299;
import java.util.Scanner;



//accepted




public class P283 {

    public static char[][] arr;
    public static int grupoMax( int f, int c){
        if (arr[f][c]==' ')return 0;
        else {
            arr[f][c]=' ';
            return  1 + (c+1>=arr[f].length?0:grupoMax(f,c+1 )) +
                    (f+1>= arr.length?0:grupoMax(f+1, c)) +
                    (c-1<0?0:grupoMax( f, c-1)) +
                    (f-1<0?0:grupoMax(f-1, c));
        }
    }
    public static void main(String[] args) {
        int f,c,maximo;
        String fila;
        Scanner scN = new Scanner(System.in);
        while (scN.hasNext()){
             f = scN.nextInt();
             c = scN.nextInt();
            scN.nextLine();
             maximo = 0;
             arr = new char[f][c];
            for (int i = 0; i < arr.length; i++) {
                 fila = scN.nextLine();
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = fila.charAt(j);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j]=='#')maximo = Math.max(maximo,grupoMax(i, j));
                }
            }
            System.out.println(maximo);
        }
    }
}
