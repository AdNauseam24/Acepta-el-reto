package p200_299;
import java.util.Scanner;


//accepted


public class P239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        while (N!=0 || M!=0) {
            int s = M*N*144;
            int m = s/60;
            s=s%60;
            int h = m/60;
            m = m%60;
            int d = h/24;
            h = h%24;
            System.out.println(d + ":" + (h>=10?h:("0"+h)) + ":" + (m>=10?m:("0"+m)) + ":" + (s>=10?s:("0"+s)));
             N = sc.nextInt();
             M = sc.nextInt();
        }
    }
}
