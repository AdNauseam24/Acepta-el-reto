package p700_799;
import java.util.Scanner;


//accepted



public class P758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int negras = x*6 -9;
            int blancas = x*x-negras;
            System.out.println(negras + " " + blancas);
        }
    }
}
