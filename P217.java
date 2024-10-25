package condicionales;
import java.util.Scanner;

//accepted

public class P217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            if (n%2==0){
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
            n= sc.nextInt();
        }
    }
}
