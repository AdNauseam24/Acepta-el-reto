package p300_399;
import java.util.Scanner;

//accepted


public class P340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(2*x*y+x+y);
        }
    }
}
