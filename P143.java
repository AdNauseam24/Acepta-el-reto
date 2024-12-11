package p100_199;
import java.util.Scanner;
import java.util.Stack;


//accepted


public class P143 {
   static void girar(int tortitasGiradas, Stack<Integer> tortitas){
        int[] arr = new int[tortitasGiradas];
            for (int j = 0; j < tortitasGiradas; j++) {
                arr[j] = tortitas.pop();
            }
            for (int j = 0; j < tortitasGiradas; j++) {
                tortitas.push(arr[j]);
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> tortitas;

        int m,x;
        int n = sc.nextInt();
        while (n!=-1) {
             tortitas  = new Stack<>();
                while (n != -1) {
                    tortitas.push(n);
                    n = sc.nextInt();
                }
                 m = sc.nextInt();
                for (int i = 0; i < m; i++) {
                    x = sc.nextInt();
                    girar(x, tortitas);
                }

                System.out.println(tortitas.pop());

            n = sc.nextInt();
            tortitas.clear();
        }
        sc.close();
    }
}
