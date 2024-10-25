package condicionales;
import java.util.Scanner;


//accepted


public class P313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int primerDia = sc.nextInt();
            int cambio = sc.nextInt();
            if (primerDia+cambio>=0){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
