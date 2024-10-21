package buclesSimples;
import java.util.Scanner;

//accepted

public class P219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int contador =0;
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                int numero = sc.nextInt();
                if (numero%2==0){
                    contador++;
                }
            }
            System.out.println(contador);

        }
    }
}
