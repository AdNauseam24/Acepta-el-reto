package p300_399;
import java.util.Scanner;



//accepted


public class P397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            if (b%3==1) System.out.println("NO");
            else System.out.println("SI");
        }
    }
}
