package p500_599;
import java.util.Scanner;



//accepted




public class P506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tension = sc.nextLine();
            String[] datos = tension.split(" / ");
            int max = Integer.parseInt(datos[0]);
            int min = Integer.parseInt(datos[1]);
            if (max>=min) System.out.println("BIEN");
            else System.out.println("MAL");
        }
    }
}
