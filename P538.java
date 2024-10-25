package condicionales;
import java.util.Scanner;


//accepted


public class P538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abuelo = sc.nextInt();
        int iglesia = sc.nextInt();
        while (abuelo!=0 || iglesia!=0) {
            if (iglesia>abuelo){
                System.out.println("SENIL");
            } else {
                System.out.println("CUERDO");
            }
            abuelo = sc.nextInt();
            iglesia = sc.nextInt();
        }
    }
}
