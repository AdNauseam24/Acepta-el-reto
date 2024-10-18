package recursividad;
import java.util.Scanner;
//accepted
public class P167 {
    static int perimetroFractal(int n) {
        int perimetro;
        //cuando el lado vale 1 sabemos que el perimetro será 4
        if(n==1){
            return 4;
            //en cualquier otro caso sabemos que el perimetro sera 4 veces el lado del que partamos
            //y le sumamos el cuadrado se dividira en otros 4 de lado n/2 que a su vez se dividiran... hasta lleagr al caso base que es 1
        }else {
            perimetro=4*n+4*perimetroFractal(n/2);
        }
        return perimetro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            System.out.println(perimetroFractal(n));
        }
    }
}
