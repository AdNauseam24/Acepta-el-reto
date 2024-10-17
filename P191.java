package buclesSimples;
import java.util.Scanner;
//accepted
public class P191 {
    static int tamanioAcuario(int compartimentos, int mayor, int diferencia){
        int resultado = 0;
        for (int i = 0; i < compartimentos; i++) {
            resultado=resultado+mayor;
            mayor=mayor-diferencia;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        int casos = scN.nextInt();
        for (int i = 0; i < casos; i++) {
            int a = scN.nextInt();
            int b = scN.nextInt();
            int c = scN.nextInt();
            System.out.println(tamanioAcuario(a,b,c));
        }

    }
}
