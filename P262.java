package buclesAnidados;

import java.util.Scanner;

public class P262 {
    public static void main(String[] args) {
        final int MODULO = 46337;
        int p,n;
        String frase;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        String[] frases = frase.split(" ");
        n = Integer.parseInt(frases[0]);
        p = Integer.parseInt(frases[1]);
        while (p!=0 || n!=0) {
            int acumulador = 0;
            for (int i = 1; i <= n; i++) {
                int multiplicador=1;
                for (int j = 0; j < p; j++) {
                    multiplicador=(multiplicador*i)%MODULO;
                }
                acumulador= (acumulador+multiplicador)%MODULO;
            }
            System.out.println(acumulador);
            frase = sc.nextLine();
            frases = frase.split(" ");
            p = Integer.parseInt(frases[0]);
            n = Integer.parseInt(frases[1]);
        }
    }
}
