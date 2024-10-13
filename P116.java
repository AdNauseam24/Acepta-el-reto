package condicionales;
import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entre 0 y 5: ");
        int n =sc.nextInt();
        switch (n){
            case 5:
                System.out.println("Hola Mundo");
            case 4:
                System.out.println("Hola Mundo");
            case 3:
                System.out.println("Hola Mundo");
            case 2:
                System.out.println("Hola Mundo");
            case 1:
                System.out.println("Hola Mundo");
                break;
            case 0:
                System.out.println("Se introdujo un 0");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
