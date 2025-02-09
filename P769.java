package p700_799;
import java.util.Scanner;


//accepted



public class P769 {
    public static char[][] cesped;

    public static void quitarCesped( int f, int c){

        if (cesped[f][c]!='.'){

            cesped[f][c]='.';

            if (c+1 <cesped[f].length)quitarCesped(f,c+1 );
            if (f+1 < cesped.length)quitarCesped(f+1, c);
            if (c-1 >= 0)quitarCesped( f, c-1);
            if (f-1 >= 0)quitarCesped( f-1, c);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int f = sc.nextInt();
            int c = sc.nextInt();

            sc.nextLine();

             cesped = new char[f][c];

             for (int i = 0; i < f; i++) {
                 String line = sc.nextLine();
                 for (int j = 0; j < line.length(); j++) {
                     cesped[i][j] = line.charAt(j);
                 }
             }

            int numeroCortacesped = 0;

            for (int i = 0; i < cesped.length; i++) {
                for (int j = 0; j < cesped[i].length; j++) {
                    if (cesped[i][j] == '#') {
                        numeroCortacesped++;
                        quitarCesped(i, j);
                    }
                }
            }

            System.out.println(numeroCortacesped);
        }
    }
}
