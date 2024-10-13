package condicionales;
import java.util.Scanner;
public class ContandoDesdeCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número de casos de prueba que se realizarán: ");
        int n = sc.nextInt();
        //El bucle se repetira el numerod e veces indicado
        for (int i = 0; i<n; i++) {
            System.out.println("Introduzca un año entre - 3000 y 3000 distinto a 0");
            int anio = sc.nextInt();
            //si el numero se sale de nuestros limites entra en un bucle hasta introducir un numero valido
            while (anio<-3000 || anio>3000 || anio==0){
                System.out.println("Introduzca un año válido");
                 anio = sc.nextInt();
            }
            //si el numero es valido y mayor que 0 se le resta 1, indicando que habria un año 0
            //en el caso de los años antes de cristo no habria cambio en ningun caso
            if(anio>0){
                anio--;
            }
            System.out.println("El año convertido sería: " + anio);
        }
    }
}
