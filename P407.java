package p400_499;
import java.util.Scanner;


//accepted


public class P407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();
        while (c!=0 || p!=0 || t!=0){
            if ((p+t)>=c)System.out.println(2*c-(p+t));
            else System.out.println(p+t);
            c = sc.nextInt();
            p = sc.nextInt();
            t = sc.nextInt();
        }
    }
}
