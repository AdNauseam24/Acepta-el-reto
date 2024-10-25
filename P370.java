package condicionales;
import java.util.Scanner;

//accepted


public class P370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String llave = sc.next();
            //separamos la string por el guion
            String[] parts = llave.split("-");
            int medida1 = Integer.parseInt(parts[0]);
            int medida2 = Integer.parseInt(parts[1]);
            //si la medida menor es par y la mayor es igual a la menor mas 1 la llave existe
            if (Math.min(medida1, medida2) % 2 == 0 && Math.max(medida1, medida2) == Math.min(medida1, medida2) + 1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
