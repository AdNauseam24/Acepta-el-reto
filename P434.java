package condicionales;
import java.util.Scanner;


//accepted


public class P434 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int palomas = sc.nextInt();
            int cajas = sc.nextInt();
            if (palomas>cajas){
                System.out.println("PRINCIPIO");
            } else {
                System.out.println("ROMANCE");
            }
        }
    }
}
