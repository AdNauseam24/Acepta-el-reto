package p400_499;
import java.util.Scanner;


//accepted


public class P403 {
    public static void main(String[] args) {
        final double MINIMO=45*90;
        final double MAXIMO=90*120;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double m2 = sc.nextInt();
            double campos = sc.nextInt();
            double metroscampo=m2/campos;
            if (metroscampo>=MINIMO && metroscampo<=MAXIMO) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
