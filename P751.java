package condicionales;
import java.util.Scanner;


//accepted


public class P751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int nac1 = sc.nextInt();
            int muerte1 = sc.nextInt();
            int nac2 = sc.nextInt();
            int muerte2 = sc.nextInt();
            int coincidencia=Math.min(muerte1, muerte2)-Math.max(nac1,nac2);
            if (coincidencia >= 0){
                System.out.println(coincidencia+1);
            } else {
                System.out.println(0);
            }
        }
    }
}
