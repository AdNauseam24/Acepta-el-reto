package p100_199;
import java.util.Scanner;


//accepted



public class P114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
             n = sc.nextInt();
             int acumulador = 1;
             if (n<5) {
                 for (int j = n; j > 1; j--) {
                     acumulador = acumulador * j % 10;
                 }
                 System.out.println(acumulador);
             }else {
                 System.out.println(0);
             }

        }
    }
}
