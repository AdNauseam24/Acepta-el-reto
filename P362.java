package condicionales;
import java.util.Scanner;


//accepted


public class P362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            if (dia==25 && mes==12){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
