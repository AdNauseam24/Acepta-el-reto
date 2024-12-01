package p100_199;
import java.util.Scanner;


//accepted


public class P166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a!=0 || b!=0) {
            System.out.println(Math.min(Math.abs(a-b),Math.min(a,b)+99-Math.max(a,b)));
             a = sc.nextInt();
             b = sc.nextInt();
        }
    }
}
