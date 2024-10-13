package buclesSimples;

import java.util.Scanner;

public class trece_catorce {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        System.out.println("Introduzca el número de casos de prueba: ");
        int n = scN.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca las medidas de la llave separadas por un \"-\"");
            String llave = scL.nextLine();
            //separamos la string por el guion
            String [] parts = llave.split("-");
            int medida1 = Integer.parseInt(parts[0]);
            int medida2 = Integer.parseInt(parts[1]);
            //si la medida menor es par y la mayor es igual a la menor mas 1 la llave existe
            if (Math.min(medida1, medida2)%2==0 && Math.max(medida1, medida2)==Math.min(medida1, medida2)+1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
