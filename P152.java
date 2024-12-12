package p100_199;
import java.util.Scanner;



//accepted





public class P152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        while (n!=0){
            int [] arr = new int[n];
            int contador=0;
            int max=0;
            int valorMax=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                int valor=arr[i];
                if (valor==-1) continue;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]==valor){
                        arr[j]=-1;
                        contador++;
                    }
                }
                if (contador>max){
                    max = contador;
                    valorMax=valor;
                }
                contador=0;
            }
            System.out.println(valorMax);
            n= sc.nextShort();
        }
    }
}
