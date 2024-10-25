package buclesSimples;
import java.util.Scanner;


//accepted



public class P515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copas = sc.nextInt();
        while (copas!=0){
            int paseo=0;
            while (copas>0){
                paseo++;
            if (paseo%2!=0){
                copas--;
            } else if (copas%2==0){
                copas-=2;
            } else {
                copas--;
            }

            }
            System.out.println(paseo);
            copas=sc.nextInt();

        }
    }
}
