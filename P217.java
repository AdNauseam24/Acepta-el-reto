package condicionales;
import java.util.Scanner;
public class LadoCalle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número de vivienda entre 1 y 1000, pulse 0 para salir");
        n = sc.nextInt();
        //El bucle solo se iniciará si el usuario introduce un numero distinto de 0
        while (n!=0) {
            //con esta condicion garantizamos que el numero no sea mayor de 1000
            if(n>1000){
                //si el numero es mayor se pide otro numero y se comienza el bucle desde el principio
                System.out.println("Introduzca un número de vivienda entre 1 y 1000, pulse 0 para salir");
                n = sc.nextInt();
                continue;
                //en cualquier otro caso se hace el resto de dividir entre 2 para saber si es par o impar
            }else{
                System.out.println(n%2==0 ? "DERECHA": "IZQUIERDA");
                //se vuelve a pedir al usuario un input para saber si se repite el bucle y se opera con el input o se cierra
                System.out.println("Introduzca un número de vivienda entre 1 y 1000, pulse 0 para salir");
                n = sc.nextInt();
            }
        }
        System.out.println("Fin del programa");
    }
}
