package p200_299;
import java.util.Scanner;




//accepted




public class P200 {
    static void dibujarArbol(int tabulaciones, int fibonacci){
        for (int i = 0; i < tabulaciones; i++) {
            System.out.print("   ");
        }
        if (fibonacci==0){
            System.out.println(0);
        } else if (fibonacci==1) {
            System.out.println(1);
        } else {
            System.out.println(calcularFibonacci(fibonacci));
            dibujarArbol(tabulaciones+1,fibonacci-2);
            dibujarArbol(tabulaciones+1,fibonacci-1);
        }


    }

    static int calcularFibonacci(int n) {
        int resultado;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            resultado = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
        return resultado;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>=0){
            dibujarArbol(0,n);
            System.out.println("====");
            n = sc.nextInt();
        }

    }
}
