package p700_799;
import java.util.Scanner;



//accepted



public class P757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String frase = sc.nextLine();
            int contadorMax = 0;
            int contador = 0;
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == 'T'){
                    contador++;
                    contadorMax = Math.max(contador,contadorMax);
                } else {
                    contador=0;
                }
            }
            System.out.println(contadorMax);
        }
    }
}
