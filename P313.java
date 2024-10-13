package condicionales;
import java.util.Scanner;
public class FinMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo, cambio, resultado;
        System.out.println("Introduzca el número de casos de prueba");
        int casos = sc.nextInt();
        //Hacemos un bucle que se repite el numero de veces que indica el usuario
        for (int i = 0; i<casos; i++) {
            System.out.println("Introduzca el saldo de su cuenta: ");
            saldo = sc.nextInt();
            System.out.println("Introduzca el cambio de balance: ");
            cambio = sc.nextInt();
            //calculamos en cuento se queda el saldo de la cuenta
            resultado = saldo + cambio;
            //Si el resultado es 0 o mayor llega a fin de mes
            if(resultado>=0){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}
