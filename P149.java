package buclesSimples;

import java.util.Scanner;
//accepted
public class P149 {
    public static void main(String[] args) {

            int casos;
            int prueba;
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int mayor = 0;
               casos = sc.nextInt();
                for (int i = 1; i <= casos; i++) {
                    prueba = sc.nextInt();
                    mayor = Math.max(mayor,prueba);
                }
                System.out.println(mayor);
            }

    }
}
