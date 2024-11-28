package p100_199;
import java.util.Scanner;


//accepted

public class P112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia= sc.nextInt();
        double limite= sc.nextInt();
        double tiempo= sc.nextInt();
        double v;
        while(distancia!=0 || limite!=0 || tiempo!=0){
            if (tiempo<=0 || limite<=0 || distancia<=0){
                System.out.println("ERROR");
            } else {
                limite /= 3.6;
                v = distancia / tiempo;
                if (v >limite) {
                    if (v - limite >= 0.2 * limite) {
                        System.out.println("PUNTOS");
                    } else {
                        System.out.println("MULTA");
                    }
                } else {
                    System.out.println("OK");
                }
            }
             distancia= sc.nextInt();
             limite= sc.nextInt();
             tiempo= sc.nextInt();
        }
    }
}
