package p100_199;
import java.util.Scanner;



//accepted



public class P165 {
    static boolean esHyperpar(int n){
        while(n!=0){
            if ((n%10)%2!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>=0){
            if (esHyperpar(n)){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n = sc.nextInt();
        }
    }
}
