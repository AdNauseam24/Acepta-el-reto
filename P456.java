package p400_499;
import java.util.Scanner;


//accepted


public class P456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int cantidad=z/(x*y) + (z%(x*y)==0?0:1);
            System.out.println(cantidad);
        }
    }
}
