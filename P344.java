package buclesSimples;
import java.util.Scanner;

//accepted

public class P344 {


    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        int n = scN.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scN.nextInt();
            int contM=0;
            int contH=0;
            for(int j=1;j<=a;j++){
                String cable = scN.next();
                if (cable.charAt(0)=='M'){
                    contM++;
                } else {
                    contH++;
                }
                if (cable.charAt(1)=='H'){
                    contH++;
                } else {
                    contM++;
                }
            }
            if(contM==contH){
                System.out.println("POSIBLE");
            }else {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}
