package p700_799;
import java.util.Scanner;


//accepted



public class P750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0){
            int aux = n;
            int contadorCeros = 0;
            while (aux>9){
                int acumulador = 1;
                while (aux != 0){
                    if (aux%10 != 0){
                        acumulador = acumulador * (aux%10);
                    } else {
                        contadorCeros++;
                    }
                    aux/=10;
                }
                aux = acumulador;

            }
            System.out.println(10*aux+contadorCeros);
            n = sc.nextInt();
        }
    }
}
