package buclesAnidados;

import java.util.Scanner;
//accepted
public class P262 {
    public static void main(String[] args) {
        final int MODULO = 46337;
        int p,n;
        int acumulador;
        int multiplicador;
        String frase;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        String[] frases = frase.split(" ");
        n = Integer.parseInt(frases[0]);
        p = Integer.parseInt(frases[1]);
        while (!(p==0 || n==0)) {
             acumulador = 0;
            for (int i = 1; i <= n; i++) {
                 multiplicador=1;
                for (int j = 0; j < p; j++) {
                    multiplicador=(multiplicador*i)%MODULO;
                }
                acumulador= (acumulador+multiplicador)%MODULO;
            }
            System.out.println(acumulador);
            frase = sc.nextLine();
            frases = frase.split(" ");
            n = Integer.parseInt(frases[0]);
            p = Integer.parseInt(frases[1]);
        }
    }
}
