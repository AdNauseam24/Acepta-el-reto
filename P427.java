package p400_499;
import java.util.Scanner;


//accepted


public class P427 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String uno = sc.next();
            String dos = sc.next();
            if (uno.equals("Luke") && dos.equals("padre")) System.out.println("TOP SECRET");
            else System.out.println(uno + ", yo soy tu " + dos);
        }
    }
}
