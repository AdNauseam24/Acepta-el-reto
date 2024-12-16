package p100_199;
import java.util.Arrays;
import java.util.Scanner;



//accepted



public class P100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc. nextInt();
            int contador = 0;
            while (contador<7){
                if (x==6174)break;
                    int[] arr = new int[4];
                for (int j = 0; j < 4; j++) {
                    arr[j]=x%10;
                    x=x/10;
                }
                Arrays.sort(arr);
                int max = 0;
                int min = 0;
                for (int j = 0; j < 4; j++) {
                    min = min*10 + arr[j];
                    max = max*10 + arr[arr.length-1-j];
                }
                x = max - min;
                if (x==0) contador = 7;
                contador++;

            }
            System.out.println(contador);

        }
    }
}
