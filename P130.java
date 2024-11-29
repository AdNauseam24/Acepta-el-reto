package p100_199;
import java.util.Scanner;


//accepted


public class P130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        while (tamanio!=0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if (x1==x2 && y2==y1){
                System.out.println(0);
            }else if ((Math.abs(x2-x1)+Math.abs(y2-y1))%2!=0){
                System.out.println("IMPOSIBLE");
            } else if (Math.abs(x2-x1) == Math.abs(y2-y1)){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
            tamanio = sc.nextInt();
        }
    }
}
