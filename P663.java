package condicionales;
import java.util.Scanner;

//accepted



public class P663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int anio = sc.nextInt();
            if (anio>0){
                anio--;
            }
            System.out.println(anio);
        }
    }
}
