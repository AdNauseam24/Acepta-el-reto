package buclesSimples;

import java.util.Scanner;

public class PoniendoMesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de copas que hay que llevar: ");
        int nCopas = sc.nextInt();
        //El programa continua hasta que el usuario introduce manualmente un 0
        while (nCopas!=0) {
            int nPaseo=1;
            int contadorPaseos=0;
            //el subproceso de contar cuantos viajes se hacen se realiza mientras haya mas de 0 copas
            while (nCopas > 0) {
                //si el numero es impar se resta una copa, si es par 2
                if (nPaseo % 2 != 0) {
                    nCopas--;
                } else {
                    nCopas -= 2;
                }
                //tras cada viaje se suma 1 al contador y 1 al numero de viaje, que comienza desde 1
                contadorPaseos++;
                nPaseo++;
            }
            //se muestra cuantos viajes han tenido que hacerse y se vuelve a pedir al usuario qeu indique una cantidad de copas
            System.out.println(contadorPaseos);
            System.out.println("Introduzca el número de copas que hay que llevar: ");
             nCopas = sc.nextInt();
        }
    }
}
