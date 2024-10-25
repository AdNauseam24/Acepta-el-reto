package buclesSimples;
import java.util.Scanner;


//accepted


public class P739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int anchoPared = sc.nextInt();
            int altoPared = sc.nextInt();
            int anchoAzulejo = sc.nextInt();
            int altoAzulejo = sc.nextInt();
            int horizontal, vertical;
            horizontal= ((anchoPared / anchoAzulejo)+(anchoPared % anchoAzulejo==0? 0:1))*((altoPared / altoAzulejo)+(altoPared % altoAzulejo==0? 0:1));
            vertical= ((anchoPared/altoAzulejo)+(anchoPared % altoAzulejo==0? 0:1))*((altoPared/anchoAzulejo)+(altoPared % anchoAzulejo==0? 0:1));
            System.out.println(Math.min(horizontal, vertical));
        }
    }
}
