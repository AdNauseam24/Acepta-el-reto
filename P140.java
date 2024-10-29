package recursividad;
import java.util.Scanner;

//accepted

public class P140_2 {
    static int sumarDigitos(int n) {
        int resultado;
        if (n < 10) {
            return n;
        } else {
            resultado = n % 10 + sumarDigitos(n / 10);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        while (numero.charAt(0)!='-'){
            int i;
            for ( i = 0; i < numero.length()-1; i++) {
                System.out.print(numero.charAt(i) + " + ");
            }
            System.out.print(numero.charAt(i) + " = ");
            System.out.print(sumarDigitos(Integer.parseInt(numero)));
            System.out.println();
            numero = sc.nextLine();
        }
    }
}
