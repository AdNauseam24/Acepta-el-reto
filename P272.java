package recursividad;
import java.util.Scanner;
//accepted



public class P272 {
    static  int base6(int n){
        int resultado;
        //el cociente 0 es nuestro caso base, que devuelve el numero anterior
        if (n/6==0){
            return n;
            //el numero más a la derecha es el resto de dividir entre 6, el de la siguiente posicion(por eso se multiplica por 10)
            //es el resultado del resto de dividir el cociente de la primera operacion, de forma que
            //creamos una función recursiva que nos coloca los digitos comenzando por la derecha
        }else {
            resultado = (n % 6)+10*base6(n/6);
        }
        return resultado;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            n = sc.nextInt();
            System.out.println(base6(n));
        }
    }
}
