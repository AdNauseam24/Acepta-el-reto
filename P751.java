package buclesSimples;

import java.util.Scanner;

public class Coetaneos {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        System.out.println("Ingrese el numero de casos a procesar: ");
        int n = scN.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las 4 fechas: ");
            String fechas= scL.nextLine();
            //xxxx xxxx xxxx xxxx
            //dividimos la string introducida en los enteros para operar
            int nac1 = Integer.parseInt(fechas.substring(0,4));
            int muer1 = Integer.parseInt(fechas.substring(5,9));
            int nac2 = Integer.parseInt(fechas.substring(10,14));
            int muer2 = Integer.parseInt(fechas.substring(15,19));
            //restamos la fecha de muerte menor menos el ño de nacimiento mayor para obetener cuenta tiempo fueron coetaneos
            //le sumamos 1 para contar el primer año de coincidencia
            //si el numero es menor que 0 se muestra un 0
            System.out.println((Math.min(muer1, muer2)-Math.max(nac1, nac2)+1) > 0 ? (Math.min(muer1, muer2)-Math.max(nac1, nac2)+1):0);
        }
    }
}
