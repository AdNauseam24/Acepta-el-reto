package p300_399;
import java.util.Scanner;


//accepted




public class P304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();
            if (divisor==0) System.out.println("DIV0");
            else {
                int cociente = dividendo/divisor;
                int resto = dividendo%divisor;
                if (resto<0){
                    if (divisor<0)cociente++;
                    else cociente--;
                }
                resto= dividendo-cociente*divisor;
                System.out.println(cociente + " " + resto);
            }
        }
    }
}
