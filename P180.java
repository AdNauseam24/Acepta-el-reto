package p100_199;
import java.util.Scanner;


//accepted


public class P180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a+b<=c || b+c<=a || c+a<=b){
                System.out.println("IMPOSIBLE");
            } else {
                double A = Math.acos(((b * b) + (c * c) - (a * a)) / (2.0 * b * c));
                A=A*180/Math.PI;
                double B = Math.acos(((a * a) + (c * c) - (b * b)) / (2.0 * a * c));
                B=B*180/Math.PI;
                double C = Math.acos(((a*a)+(b*b)-(c*c)) / (2.0*a*b));
                C=C*180/Math.PI;

                if (A>90 || B>90 || C>90) System.out.println("OBTUSANGULO");
                else if (A == 90 || B == 90 || C == 90) System.out.println("RECTANGULO");
                else System.out.println("ACUTANGULO");


            }
        }
    }
}
