package p600_699;
import java.util.Scanner;


//accepted



public class P644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,e,de;
        int A = sc.nextInt();
        while (A!=0){
             d = (19*(A%19) + 24)%30;
             e = (2*(A%4) + 4*(A%7) + 6*d + 5)%7;
             de=d+e;
            if (de<10){
                System.out.println((de+22) + " de marzo");
            } else {
                if (de-9==26) System.out.println("19 de abril");
                else if (de-9==25 && d==28) System.out.println("18 de abril");
                else System.out.println((de-9) + " de abril");
            }
            A = sc.nextInt();
        }
    }
}
