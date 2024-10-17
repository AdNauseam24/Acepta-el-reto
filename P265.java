package buclesSimples;
import java.util.Scanner;
//accepted
public class P265 {
    static int sumaDes(int n){
        int resultado=n;
        int n2=n;
        int divisor=10;
        while (n2>9){
            resultado = resultado + n%divisor;
            divisor=divisor*10;
            n2/=10;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            System.out.println(sumaDes(n));
            n = sc.nextInt();
        }
    }
}
