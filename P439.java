package condicionales;
import java.util.Scanner;


//accepted


public class P439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int distancia=0;
            int tiempo=0;
            int velocidad=0;
            String dato1 = sc.next();
            switch (dato1.charAt(0)){
                case 'D':
                    distancia=Integer.parseInt(dato1.substring(2));
                    break;
                case 'T':
                    tiempo=Integer.parseInt(dato1.substring(2));
                    break;
                case 'V':
                    velocidad=Integer.parseInt(dato1.substring(2));
            }
            String dato2 = sc.next();
            switch (dato2.charAt(0)){
                case 'D':
                    distancia=Integer.parseInt(dato2.substring(2));
                    break;
                case 'T':
                    tiempo=Integer.parseInt(dato2.substring(2));
                    break;
                case 'V':
                    velocidad=Integer.parseInt(dato2.substring(2));
                    break;
            }
            if (distancia==0){
                distancia=velocidad*tiempo;
                System.out.println("D=" + distancia);
            } else if (tiempo==0) {
                tiempo=distancia/velocidad;
                System.out.println("T=" + tiempo);
            } else if (velocidad==0) {
                velocidad=distancia/tiempo;
                System.out.println("V=" + velocidad);
            }

        }
    }
}
