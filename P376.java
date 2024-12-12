package p300_399;
import java.util.Scanner;


//accepted




public class P376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0){
            int contadorPicos = 0;
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] > (i==0 ? arr[arr.length-1] : arr[i-1])) && arr[i] > (i == arr.length-1 ? arr[0] : arr[i+1])){
                    contadorPicos++;
                }
            }
            System.out.println(contadorPicos);
            n=sc.nextInt();

        }
    }
}
