package p700_799;
import java.util.Scanner;


//accepted



public class P715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a/b>=12) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
